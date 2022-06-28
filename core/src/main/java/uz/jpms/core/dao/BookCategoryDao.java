package uz.jpms.core.dao;

import uz.jpms.core.domain.book.BookCategory;

import java.util.List;
import java.util.Optional;

public class BookCategoryDao extends AbstractDao<BookCategory, Long> {
    @Override
    public Optional<BookCategory> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public List<BookCategory> findAll() {
        return null;
    }

    @Override
    public BookCategory save() {
        return null;
    }

    @Override
    public List<BookCategory> saveAll() {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
