package uz.jpms.core.dao;

import uz.jpms.core.domain.book.BookGenre;

public class BookGenreDao extends AbstractDao<BookGenre, Long> {

    private static final BookGenreDao dao = new BookGenreDao();

    public static BookGenreDao provide() {
        return dao;
    }

}
