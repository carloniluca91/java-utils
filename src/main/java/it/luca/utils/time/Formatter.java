package it.luca.utils.time;

import java.time.format.DateTimeFormatter;

public class Formatter {

    /**
     * Format a string representing a date from one pattern to another
     * @param date input string
     * @param inputPattern pattern of input string
     * @param outputPattern pattern for output string
     * @return input string formatted with given output pattern
     */

    public static String formatDate(String date, String inputPattern, String outputPattern) {

        return Converter.toDate(date, inputPattern)
                .format(DateTimeFormatter.ofPattern(outputPattern));
    }
}
