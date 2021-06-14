package it.luca.utils.time;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtils {

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

    /**
     * Convert input string to LocalDate
     * @param date input string
     * @param pattern input string's pattern
     * @return instance of LocalDate
     */

    public static LocalDate toDate(String date, String pattern) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * Convert input string to LocalDate
     * @param date input string
     * @param formatter input string's pattern
     * @return instance of LocalDate
     */

    public static LocalDate toDate(String date, DateTimeFormatter formatter) {
        return LocalDate.parse(date, formatter);
    }

    /**
     * Convert input string to LocalDateTime
     * @param date input string
     * @param pattern input string's pattern
     * @return instance of LocalDateTime
     */

    public static LocalDateTime toDateTime(String date, String pattern) {
        return LocalDateTime.parse(date, DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * Convert input string to LocalDateTime
     * @param date input string
     * @param formatter input string's pattern
     * @return instance of LocalDateTime
     */

    public static LocalDateTime toDateTime(String date, DateTimeFormatter formatter) {
        return LocalDateTime.parse(date, formatter);
    }

    /**
     * Convert input string to a java.sql.Timestamp
     * @param date input string
     * @param pattern input string's pattern
     * @return instance of java.sql.Timestamp
     */
    
    public static Timestamp toTimestamp(String date, String pattern) {

        return Timestamp.valueOf(toDateTime(date, pattern));
    }
}