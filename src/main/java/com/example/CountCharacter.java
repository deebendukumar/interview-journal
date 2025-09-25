package com.example;

import java.util.stream.*;

class CountCharacter {

    public static long count(String s, char ch) {
        // converting the string to an IntStream of the character codes,
        // filter by the character code of the specified character,
        // and count the occurrences
        return s.chars()
                .filter(c -> c == ch)
                .count();
    }

    // Main method to test count method
    public static void main(String args[]) {
        String str = "kumar";
        char c = 'k';
        System.out.println(count(str, c));
    }
}