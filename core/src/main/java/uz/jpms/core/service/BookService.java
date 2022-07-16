package uz.jpms.core.service;

import uz.jpms.core.dao.BookDao;
import uz.jpms.core.domain.book.Book;
import uz.jpms.core.domain.book.BookCategory;
import uz.jpms.core.domain.book.BookGenre;
import uz.jpms.core.service.impl.BookServiceImpl;

import java.util.List;
import java.util.Map;

public interface BookService {

    BookService service = new BookServiceImpl(BookDao.provide());

    static BookService provide() {
        return service;
    }

    Book createOrUpdate(Book book);

    Book findById(Long bookId);

    List<Book> findAll();

    Map<BookGenre, List<Book>> groupByGenre();

    Map<BookCategory, List<Book>> groupByCategory();

    void remove(Long bookId);

}
