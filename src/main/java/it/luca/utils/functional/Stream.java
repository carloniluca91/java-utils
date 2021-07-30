package it.luca.utils.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream {

    /**
     * Same as {@link #allMatch(List, Predicate)}
     */

    public static <T> boolean allMatch(T[] array, Predicate<T> predicate) {

        return allMatch(Arrays.asList(array), predicate);
    }

    /**
     * Evaluates if all elements of the collection satisfy a predicate
     * @param list input collection
     * @param predicate predicate to be evaluated
     * @param <T> type of collection element
     * @return true if all elements in the collection satisfy the predicate, false otherwise
     */

    public static <T> boolean allMatch(List<T> list, Predicate<T> predicate) {

        return list.stream().allMatch(predicate);
    }


    /**
     * Same as {@link #anyMatch(List, Predicate)}
     */

    public static <T> boolean anyMatch(T[] array, Predicate<T> predicate) {

        return anyMatch(Arrays.asList(array), predicate);
    }

    /**
     * Evaluates if at least one element of the collection satisfies a predicate
     * @param list input collection
     * @param predicate predicate to be evaluated
     * @param <T> type of collection element
     * @return true if at least one element in the collection satisfies the predicate, false otherwise
     */

    public static <T> boolean anyMatch(List<T> list, Predicate<T> predicate) {

        return list.stream().anyMatch(predicate);
    }

    /**
     * Same as {@link #filter(List, Predicate)}
     */

    public static <T> List<T> filter(T[] array, Predicate<T> predicate) {

        return filter(Arrays.asList(array), predicate);
    }

    /**
     * Filter a collection by a predicate
     * @param list input collection
     * @param predicate predicate to be evaluated on each collection element
     * @param <T> type of collection element
     * @return list with elements from input collection satisfying predicate
     */

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {

        return list.stream().filter(predicate)
                .collect(Collectors.toList());
    }

    /**
     * Same as {@link #map(List, Function)}}
     */

    public static <T, R> List<R> map(T[] array, Function<T, R> function) {

        return map(Arrays.asList(array), function);
    }

    /**
     * Applies given function to each element of collection
     * @param list input collection
     * @param function function to apply on each collection element
     * @param <T> type of input collection's element
     * @param <R> type of output collection's element
     * @return list of elements obtained by applying given function to each element of input collection
     */

    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {

        return list.stream().map(function)
                .collect(Collectors.toList());
    }

    /**
     * Applies given function to each element of collection
     * @param list input collection
     * @param function function to apply on each collection element
     * @param <T> type of input collection's element
     * @param <R> type of output collection's element
     * @return list of distinct elements obtained by applying given function to each element of input collection
     */

    public static <T, R> List<R> mapDistinct(List<T> list, Function<T, R> function) {

        return list.stream().map(function)
                .distinct()
                .collect(Collectors.toList());
    }
}
