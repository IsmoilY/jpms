package uz.jpms.core.dao;

import uz.jpms.core.domain.book.Book;

import java.util.List;
import java.util.Optional;

public class BookDao extends AbstractDao<Book, Long> {
    @Override
    public Optional<Book> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public Book save() {
        return null;
    }

    @Override
    public List<Book> saveAll() {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
