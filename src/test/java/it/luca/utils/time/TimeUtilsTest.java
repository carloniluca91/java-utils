package it.luca.utils.time;

import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class TimeUtilsTest {

    @Test
    void toDate() {

        String DATE = "2021-01-01";
        assertDoesNotThrow(() -> TimeUtils.toDate(DATE, "yyyy-MM-dd"));
        assertDoesNotThrow(() -> TimeUtils.toDate(DATE, DateTimeFormatter.ISO_LOCAL_DATE));
    }

    @Test
    void toDateTime() {

        String DATE_TIME = "2021-01-01T12:00:00";
        assertDoesNotThrow(() -> TimeUtils.toDateTime(DATE_TIME, "yyyy-MM-dd'T'HH:mm:ss"));
        assertDoesNotThrow(() -> TimeUtils.toDateTime(DATE_TIME, DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}