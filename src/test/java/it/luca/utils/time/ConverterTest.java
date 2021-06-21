package it.luca.utils.time;

import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ConverterTest {

    private final String DATE_TIME = "2021-01-01T12:00:00";
    private final String DATE_TIME_PATTERN = "yyyy-MM-dd'T'HH:mm:ss";

    @Test
    void toDate() {

        String DATE = "2021-01-01";
        assertDoesNotThrow(() -> Converter.toDate(DATE, "yyyy-MM-dd"));
        assertDoesNotThrow(() -> Converter.toDate(DATE, DateTimeFormatter.ISO_LOCAL_DATE));
    }

    @Test
    void toDateTime() {

        assertDoesNotThrow(() -> Converter.toDateTime(DATE_TIME, DATE_TIME_PATTERN));
        assertDoesNotThrow(() -> Converter.toDateTime(DATE_TIME, DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }

    @Test
    void toTimestamp() {

        assertDoesNotThrow(() -> Converter.toTimestamp(DATE_TIME, DATE_TIME_PATTERN));
    }
}