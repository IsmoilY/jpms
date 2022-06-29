package uz.jpms.core.service.impl;

import uz.jpms.core.domain.book.Book;
import uz.jpms.core.domain.book.BookGenre;
import uz.jpms.core.service.BookService;

import java.util.List;
import java.util.Map;

public class BookServiceImpl implements BookService {
    @Override
    public Book createOrUpdate(Book book) {
        return null;
    }

    @Override
    public Book findById(Long bookId) {
        return null;
    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public Map<BookGenre, List<Book>> groupByGenre() {
        return null;
    }

    @Override
    public Map<BookGenre, List<Book>> groupByCategory() {
        return null;
    }

    @Override
    public void remove(Long bookId) {

    }
}
