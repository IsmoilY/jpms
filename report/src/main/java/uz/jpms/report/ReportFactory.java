package uz.jpms.report;

import uz.jpms.core.service.BookService;
import uz.jpms.core.service.UserResourceService;
import uz.jpms.core.service.UserService;

public class ReportFactory {

    private static BookReporter bookReporter = new BookReporterImpl(BookService.provide());
    private static UserReporter userReporter = new UserReporterImpl(UserService.provide(), UserResourceService.provide());

    public static BookReporter createBookReporter() {
        return bookReporter;
    }

    public static UserReporter createUserReporter() {
        return userReporter;
    }

}
