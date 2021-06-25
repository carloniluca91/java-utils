package it.luca.utils.time;

import java.time.format.DateTimeFormatter;

public class Formatter {

    public static String formatDate(String date, String inputPattern, String outputPattern) {

        return Converter.toDate(date, inputPattern)
                .format(DateTimeFormatter.ofPattern(outputPattern));
    }
}
