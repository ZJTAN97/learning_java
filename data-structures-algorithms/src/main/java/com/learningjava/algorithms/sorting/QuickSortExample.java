package com.learningjava.algorithms.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSortExample {

    private static List<Integer> quicksort(List<Integer> list) {
        if (list.size() < 2) {
            // base case, arrays with 0 or 1 elemnt are technically "sorted"
            return list;
        } else {

            // recursive case
            int pivot = list.get(0);

            // Sub array of all elements less than the pivot
            List<Integer> lesser = list.stream().skip(1).filter(item -> item <= pivot)
                .collect(Collectors.toList());


            // Sub array for all elements more than the pivot
            List<Integer> higher = list.stream().skip(1).filter(item -> item > pivot)
                .collect(Collectors.toList());


            List<Integer> sorted = Stream.of(
                    quicksort(lesser).stream(),
                    Stream.of(pivot),
                    quicksort(higher).stream()
                ).flatMap(Function.identity())
                .collect(Collectors.toList());

            return sorted;
        }
    }

    public static void main(String[] args) {

        List<Integer> unsorted = Arrays.asList(10, 5, 3, 2);

        System.out.println(quicksort(unsorted));

    }

}
