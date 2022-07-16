package uz.jpms.logger.console;

import uz.jpms.logger.Logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleLogger implements Logger {

    private static final String DATE_TIME_FORM = "yyyy-MM-dd HH:mm:ss";

    public static String getCurrentTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_TIME_FORM));
    }

    /**
     * name of a class using logger
     * to identify where from logs generated
     */
    private final String name;

    public ConsoleLogger(String name) {
        this.name = name;
    }

    @Override
    public void info(String message) {
        System.out.println(getCurrentTime() + " | INFO | " + name + " :  " + message);
    }

    @Override
    public void error(String message) {
        System.err.println(getCurrentTime() + " | ERROR | " + name + " :  " + message);
    }

}
