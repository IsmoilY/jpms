package uz.jpms.report;

import uz.jpms.core.domain.book.Book;
import uz.jpms.core.domain.user.User;

import java.util.List;
import java.util.Map;

public class UserReporterImpl implements UserReporter {
    @Override
    public Integer countActiveUsers() {
        return null;
    }

    @Override
    public Integer countInActiveUsers() {
        return null;
    }

    @Override
    public Map<User, List<Book>> userBooks() {
        return null;
    }
}
