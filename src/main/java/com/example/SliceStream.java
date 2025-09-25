package com.example;

import java.util.*;
import java.util.stream.Stream;

class SliceStream {

    // Method to get a slice of a stream from startIndex to endIndex
    public static <T> Stream<T>
    getSliceOfStream(Stream<T> stream, int startIndex, int endIndex) {
        return stream
                // Skip elements until the startIndex
                .skip(startIndex)
                // Limit the stream to elements between startIndex and endIndex
                .limit(endIndex - startIndex + 1);
    }

    public static void main(String args[]) {
        // Create a list of integers
        List<Integer> list = new ArrayList<>();
        for (int i = 10; i <= 19; i++)
            list.add(i);

        // Get a stream from the list
        Stream<Integer> intStream = list.stream();
        // Print the original list
        System.out.println("List: " + list);
        // Get a slice of the stream from index 3 to 7
        Stream<Integer> sliceOfIntStream = getSliceOfStream(intStream, 3, 7);

        // Print the slice of the stream
        System.out.println("\nSlice of Stream:");
        sliceOfIntStream.forEach(System.out::println);
    }
}