package it.luca.utils.functional;

import java.util.function.Function;

public class Optional {

    /**
     * Perform a not-null check on given input
     * @param input input to test
     * @param <T> type of input to test
     * @return true if given input is null, false otherwise
     */

    public static <T> boolean isPresent(T input) {

        return java.util.Optional.ofNullable(input).isPresent();
    }

    /**
     * Applies a given function to an input, or returns a default value
     * @param input input
     * @param function function to be applied on input
     * @param elseValue default value if input is null
     * @param <T> input type
     * @param <R> output type
     * @return the result obtained applying function to input if this is not null, or the default value
     */

    public static <T, R> R orElse(T input, Function<T, R> function, R elseValue) {

        return java.util.Optional.ofNullable(input)
                .map(function)
                .orElse(elseValue);
    }

    /**
     * Applies a given function to an input, or returns null
     * @param input input
     * @param function function to be applied on input
     * @param <T> input type
     * @param <R> output type
     * @return the result obtained applying function to input if this is not null, or null
     */

    public static <T, R> R orNull(T input, Function<T, R> function) {

        return orElse(input, function, null);
    }
}
