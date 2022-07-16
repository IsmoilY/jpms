package uz.jpms.core.dao;

import uz.jpms.core.domain.book.BookCategory;

public class BookCategoryDao extends AbstractDao<BookCategory, Long> {

    private static final BookCategoryDao dao = new BookCategoryDao();

    public static BookCategoryDao provide() {
        return dao;
    }

}
