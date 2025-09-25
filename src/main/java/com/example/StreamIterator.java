package com.example;// Java program demonstration to iterate over Stream with Indices

import java.util.stream.IntStream;

class StreamIterator {
    public static void main(String[] args) {

        // Array of Strings
        String[] array = {"G", "E", "E", "k"};

        // Iterating over the indices of an array
        IntStream
                // Generate indices from 0 to array length
                .range(0, array.length)
                // Map each index to its corresponding string representation
                .mapToObj(index -> String.format("%d -> %s", index, array[index]))
                // print each and every element of the stream
                .forEach(System.out::println);
    }
}