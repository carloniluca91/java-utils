package it.luca.utils.time;

import org.junit.jupiter.api.Test;

import static it.luca.utils.time.Supplier.now;
import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void isValidDate() {

        String pattern = "yyyy/MM/dd";
        String now = now(pattern);
        assertTrue(Validator.isValidDate(now, pattern));
    }

    @Test
    void isValidDateTime() {

        String pattern = "dd/MM/yyyy HH:mm";
        String now = now(pattern);
        assertTrue(Validator.isValidDateTime(now, pattern));
    }
}