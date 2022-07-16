package uz.jpms.core.service.impl;

import uz.jpms.core.dao.BookDao;
import uz.jpms.core.domain.book.Book;
import uz.jpms.core.domain.book.BookCategory;
import uz.jpms.core.domain.book.BookGenre;
import uz.jpms.core.service.BookService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookServiceImpl implements BookService {

    private final BookDao dao;

    public BookServiceImpl(BookDao dao) {
        this.dao = dao;
    }

    @Override
    public Book createOrUpdate(Book book) {
        return dao.save(book);
    }

    @Override
    public Book findById(Long bookId) {
        return dao.findById(bookId).orElseThrow();
    }

    @Override
    public List<Book> findAll() {
        return dao.findAll();
    }

    @Override
    public Map<BookGenre, List<Book>> groupByGenre() {
        return findAll()
                .stream()
                .collect(Collectors.groupingBy(Book::getGenre));
    }

    @Override
    public Map<BookCategory, List<Book>> groupByCategory() {
        return findAll()
                .stream()
                .collect(Collectors.groupingBy(Book::getCategory));
    }

    @Override
    public void remove(Long bookId) {
        dao.deleteById(bookId);
    }
}
