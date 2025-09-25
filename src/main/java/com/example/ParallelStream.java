package com.example;

import java.util.*;
import java.util.stream.*;

class ParallelStream {

    // Generic function to reverse
    // the elements of the parallel stream
    public static <T> Collector<T, ?, Stream<T>> reverseStream() {
        return Collectors.collectingAndThen(Collectors.toList(),
                list -> {
                    Collections.reverse(list);
                    return list.stream();
                });
    }

    // Driver code
    public static void main(String args[]) {
        // Get the parallel stream
        List<Integer> lists = Arrays.asList(217, 317, 417, 517);
        Stream<Integer> stream = lists.parallelStream();
        // Reverse and print the elements
        stream.collect(reverseStream()).forEach(System.out::println);
    }
}