package it.luca.utils.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream {

    /**
     * Filter an array by a predicate
     * @param array input array
     * @param predicate predicate to be evaluated on each array element
     * @param <T> type of array element
     * @return list with elements from input array satisfying predicate
     */

    public static <T> List<T> filter(T[] array, Predicate<T> predicate) {

        return filter(Arrays.asList(array), predicate);
    }

    /**
     * Filter a list by a predicate
     * @param list input list
     * @param predicate predicate to be evaluated on each list element
     * @param <T> type of list element
     * @return list with elements from input list satisfying predicate
     */

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {

        return list.stream().filter(predicate)
                .collect(Collectors.toList());
    }

    /**
     * Applies given function to each element of array
     * @param array input array
     * @param function function to apply on each array element
     * @param <T> type of input array's element
     * @param <R> type of output array's element
     * @return list of elements obtained by applying given function to each element of input array
     */

    public static <T, R> List<R> map(T[] array, Function<T, R> function) {

        return map(Arrays.asList(array), function);
    }

    /**
     * Applies given function to each element of list
     * @param list input list
     * @param function function to apply on each list element
     * @param <T> type of input list's element
     * @param <R> type of output list's element
     * @return list of elements obtained by applying given function to each element of input list
     */

    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {

        return list.stream().map(function)
                .collect(Collectors.toList());
    }

    /**
     * Applies given function to each element of list
     * @param list input list
     * @param function function to apply on each list element
     * @param <T> type of input list's element
     * @param <R> type of output list's element
     * @return list of distinct elements obtained by applying given function to each element of input list
     */

    public static <T, R> List<R> mapDistinct(List<T> list, Function<T, R> function) {

        return list.stream().map(function)
                .distinct()
                .collect(Collectors.toList());
    }
}
