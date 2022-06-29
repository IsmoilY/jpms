package uz.jpms.logger;

import uz.jpms.logger.console.ConsoleLogger;
import uz.jpms.logger.console.Logger;

public class LoggerFactory {

    public static Logger create(Class<Object> toLog) {
        return new ConsoleLogger(toLog.getSimpleName());
    }

}
