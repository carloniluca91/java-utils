package it.luca.utils.functional;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class StreamTest {

    private final String[] ARRAY = {"hello", "world"};
    private final List<String> LIST = Arrays.asList(ARRAY);

    @Test
    void allMatch() {

        assertFalse(Stream.allMatch(ARRAY, s -> s.startsWith("h")));
        assertTrue(Stream.allMatch(ARRAY, s -> s.contains("l")));
    }

    @Test
    void anyMatch() {

        assertTrue(Stream.anyMatch(ARRAY, s -> s.startsWith("h")));
        assertFalse(Stream.anyMatch(ARRAY, s -> s.startsWith("x")));
    }

    @Test
    void filter() {

        Predicate<String> predicate = s -> s.startsWith("h");
        long expectedCount = Arrays.stream(ARRAY).filter(predicate).count();
        assertEquals(expectedCount, Stream.filter(ARRAY, predicate).size());
        assertEquals(expectedCount, Stream.filter(LIST, predicate).size());
    }

    @Test
    void map() {

        Function<String, String> function = String::toUpperCase;
        List<String> mapArray = Stream.map(ARRAY, function);
        List<String> mapList = Stream.map(LIST, function);
        IntStream.range(0, ARRAY.length).forEach(i -> {

            String expected = function.apply(ARRAY[i]);
            assertEquals(expected, mapArray.get(i));
            assertEquals(expected, mapList.get(i));
        });
    }
}