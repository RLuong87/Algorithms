package com.company;

import java.util.HashMap;

public class DoubleLetters {

    /*
    Edabit Challenge

    Create a function that takes a word and returns true if the word has two consecutive identical letters.

    Examples:
    doubleLetters("loop") ➞ true

    doubleLetters("yummy") ➞ true

    doubleLetters("orange") ➞ false

    doubleLetters("munchkin") ➞ false
    */

    public static boolean doubleLetters(String word) {

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(0) == word.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(doubleLetters("loop"));
        System.out.println(doubleLetters("yummy"));
        System.out.println(doubleLetters("orange"));
        System.out.println(doubleLetters("munchkin"));

        String word = "yummy";
        int length = word.length();

        boolean repeat = false;
        boolean noRepeat = true;

        for (int i = 0; i < word.length(); i++) {

            for (int j = 0; j < word.length(); j++) {

//                System.out.println(word.charAt(i) == word.charAt(j));
            }
        }
//        System.out.println(length);
    }
}
