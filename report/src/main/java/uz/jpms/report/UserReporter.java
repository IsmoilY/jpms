package uz.jpms.report;

import uz.jpms.core.domain.book.Book;
import uz.jpms.core.domain.user.User;

import java.util.Map;
import java.util.Set;

public interface UserReporter {

    Integer countActiveUsers();

    Integer countInActiveUsers();

    Map<User, Set<Book>> userBooks();

}
