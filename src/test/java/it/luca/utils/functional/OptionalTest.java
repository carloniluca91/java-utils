package it.luca.utils.functional;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class OptionalTest {

    private final String INPUT = "hello";

    @Test
    void isPresent() {

        assertTrue(Optional.isPresent(INPUT));
        assertFalse(Optional.isPresent((String) null));
    }

    @Test
    void orElse() {

        String ELSE_VALUE = "boh";
        Function<String, String> function = String::toUpperCase;
        assertEquals(function.apply(INPUT), Optional.orElse(INPUT, function, ELSE_VALUE));
        assertEquals(ELSE_VALUE, Optional.orElse(null, function, ELSE_VALUE));
    }

    @Test
    void orNull() {

        Function<String, String> function = String::toUpperCase;
        assertEquals(function.apply(INPUT), Optional.orNull(INPUT, function));
        assertNull(Optional.orNull(null, function));
    }
}