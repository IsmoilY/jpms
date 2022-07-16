package uz.jpms.report;

public class ReportFactory {

    private static BookReporter bookReporter;
    private static UserReporter userReporter;

    static BookReporter createBookReporter() {
        return bookReporter;
    }

    static UserReporter createUserReporter() {
        return userReporter;
    }

}
