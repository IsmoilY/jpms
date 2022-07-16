package uz.jpms.report;

import uz.jpms.core.domain.book.Book;
import uz.jpms.core.service.BookService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookReporterImpl implements BookReporter {

    private final BookService service;

    public BookReporterImpl(BookService service) {
        this.service = service;
    }

    @Override
    public Map<String, Integer> booksByGenre() {
        var collect = service.findAll().stream().collect(Collectors.groupingBy(Book::getGenre));
        return collect.entrySet()
                .stream()
                .collect(Collectors.toMap(key -> key.getKey().getName(), val -> val.getValue().size()));
    }

    @Override
    public Map<String, Integer> booksByAuthor() {
        var collect = service.findAll().stream().collect(Collectors.groupingBy(Book::getAuthor));
        return collect.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, val -> val.getValue().size()));
    }

    @Override
    public List<Book> availableBooks() {
        return service.findAll().stream().filter(book -> book.getQuantity() > 0).collect(Collectors.toList());
    }

    @Override
    public List<Book> notAvailableBooks() {
        return service.findAll().stream().filter(book -> book.getQuantity() <= 0).collect(Collectors.toList());
    }
}
