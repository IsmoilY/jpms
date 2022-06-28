package uz.jpms.core.util;

public final class EntityUtil {

    protected static long LONG_GENERATOR = 0L;

    public static long generateLongID() {
        return ++LONG_GENERATOR;
    }

}
