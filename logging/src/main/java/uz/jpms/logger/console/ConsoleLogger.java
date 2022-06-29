package uz.jpms.logger.console;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleLogger implements Logger {

    private static final String DATE_TIME_FORM = "yyyy-MM-dd HH:mm:ss";

    public static String getCurrentTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_TIME_FORM));
    }

    private final String name;

    public ConsoleLogger(String name) {
        this.name = name;
    }

    @Override
    public void info(String message) {
        System.out.println(getCurrentTime() + " | " + name + " :  " + message);
    }

    @Override
    public void error(String message) {
        System.err.println(getCurrentTime() + " | " + name + " :  " + message);
    }

}
