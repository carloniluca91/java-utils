package it.luca.utils.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Supplier {

    /**
     * Get current time
     * @return current time
     */

    public static LocalDateTime now() {
        return LocalDateTime.now();
    }

    /**
     * Get current time as string with given pattern
     * @param pattern output pattern
     * @return current time
     */

    public static String now(String pattern) {
        return now().format(DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * Get current time as string with pattern equal to given formatter
     * @param formatter output formatter
     * @return current time
     */

    public static String now(DateTimeFormatter formatter) {
        return now().format(formatter);
    }

}
