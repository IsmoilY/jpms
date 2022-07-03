package uz.jpms.report;

import uz.jpms.core.domain.book.Book;
import uz.jpms.core.domain.user.User;

import java.util.List;
import java.util.Map;

public interface UserReporter {

    Integer countActiveUsers();

    Integer countInActiveUsers();

    Map<User, List<Book>> userBooks();

}
