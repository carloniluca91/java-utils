package it.luca.utils.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtils {

    public static LocalDateTime now() {
        return LocalDateTime.now();
    }

    public static String now(String pattern) {
        return now().format(DateTimeFormatter.ofPattern(pattern));
    }

    public static String now(DateTimeFormatter formatter) {
        return now().format(formatter);
    }
}