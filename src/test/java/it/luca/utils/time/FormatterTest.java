package it.luca.utils.time;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormatterTest {

    @Test
    void formatDate() {

        String date = "01/01/2021";
        String inputPattern = "dd/MM/yyyy";
        String outputPattern = "yyyy-MM-dd";
        assertTrue(Validator.isValidDate(Formatter.formatDate(date, inputPattern, outputPattern), outputPattern));
    }
}