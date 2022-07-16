package uz.jpms.core.dao;

import uz.jpms.core.domain.book.Book;

public class BookDao extends AbstractDao<Book, Long> {

    private static final BookDao dao = new BookDao();

    public static BookDao provide() {
        return dao;
    }

}
