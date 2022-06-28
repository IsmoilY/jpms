package uz.jpms.core.dao;

import uz.jpms.core.domain.book.BookGenre;

import java.util.List;
import java.util.Optional;

public class BookGenreDao extends AbstractDao<BookGenre, Long> {
    @Override
    public Optional<BookGenre> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public List<BookGenre> findAll() {
        return null;
    }

    @Override
    public BookGenre save() {
        return null;
    }

    @Override
    public List<BookGenre> saveAll() {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
