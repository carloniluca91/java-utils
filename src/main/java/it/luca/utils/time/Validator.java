package it.luca.utils.time;

import java.time.format.DateTimeParseException;

import static it.luca.utils.time.Converter.toDate;
import static it.luca.utils.time.Converter.toDateTime;

public class Validator {

    /**
     * Validate input string as date
     * @param date input string
     * @param pattern input string's pattern
     * @return true if input string matches given pattern, false otherwise
     */

    public static boolean isValidDate(String date, String pattern) {

        try {
            toDate(date, pattern);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    /**
     * Validate input string as dateTime
     * @param date input string
     * @param pattern input string's pattern
     * @return true if input string matches given pattern, false otherwise
     */

    public static boolean isValidDateTime(String date, String pattern) {

        try {
            toDateTime(date, pattern);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
