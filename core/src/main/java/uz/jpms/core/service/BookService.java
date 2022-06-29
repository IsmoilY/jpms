package uz.jpms.core.service;

import uz.jpms.core.domain.book.Book;
import uz.jpms.core.domain.book.BookGenre;

import java.util.List;
import java.util.Map;

public interface BookService {

    Book createOrUpdate(Book book);

    Book findById(Long bookId);

    List<Book> findAll();

    Map<BookGenre, List<Book>> groupByGenre();

    Map<BookGenre, List<Book>> groupByCategory();

    void remove(Long bookId);

}
