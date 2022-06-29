package uz.jpms.logger;

import uz.jpms.logger.console.ConsoleLogger;

public class LoggerFactory {

    public static Logger create(Class<?> toLog) {
        return new ConsoleLogger(toLog.getSimpleName());
    }

}
