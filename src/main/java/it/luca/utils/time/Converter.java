package it.luca.utils.time;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Converter {

    /**
     * Convert input string to {@link LocalDate}
     * @param date input string
     * @param pattern input string's pattern
     * @return {@link LocalDate}
     */

    public static LocalDate toDate(String date, String pattern) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * Convert input string to {@link LocalDate}
     * @param date input string
     * @param formatter input string's pattern
     * @return {@link LocalDate}
     */

    public static LocalDate toDate(String date, DateTimeFormatter formatter) {
        return LocalDate.parse(date, formatter);
    }

    /**
     * Convert input string to {@link LocalDateTime}
     * @param date input string
     * @param pattern input string's pattern
     * @return {@link LocalDateTime}
     */

    public static LocalDateTime toDateTime(String date, String pattern) {
        return LocalDateTime.parse(date, DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * Convert input string to {@link LocalDateTime}
     * @param date input string
     * @param formatter input string's pattern
     * @return {@link LocalDateTime}
     */

    public static LocalDateTime toDateTime(String date, DateTimeFormatter formatter) {
        return LocalDateTime.parse(date, formatter);
    }

    /**
     * Convert input string to a {@link Timestamp}
     * @param date input string
     * @param pattern input string's pattern
     * @return {@link Timestamp}
     */
    
    public static Timestamp toTimestamp(String date, String pattern) {

        return Timestamp.valueOf(toDateTime(date, pattern));
    }
}