package uz.jpms.report;

import uz.jpms.core.domain.book.Book;

import java.util.List;
import java.util.Map;

public interface BookReporter {

    Map<String, Integer> booksByGenre();

    Map<String, Integer> booksByAuthor();

    List<Book> availableBooks();

    List<Book> notAvailableBooks();

}
