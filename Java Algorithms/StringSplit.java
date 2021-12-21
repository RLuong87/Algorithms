package com.company;

public class StringSplit {

    /*
    Write a function that takes a string, breaks it up and returns it with vowels first, consonants second.
    For any character that's not a vowel (like special characters or spaces), treat them like consonants.

    Examples:
    split("abcde") ➞ "aebcd"

    split("Hello!") ➞ "eoHll!"

    split("What's the time?") ➞ "aeieWht's th tm?"

    Notes:

    Vowels are a, e, i, o, u.
    Define a separate isVowel() function for easier to read code (recommendation).
     */

    public static String split(String str) {

        return "";
    }

    public static void main(String[] args) {

        System.out.println(split("abcde"));
        System.out.println(split("Hello"));
        System.out.println(split("What's the time?"));

        String str = "abcde", splitStr = "";

        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' && Character.isUpperCase(c)) {
                splitStr += c;
            } else {
                splitStr += c;
            }
        }
        System.out.println(splitStr);
    }

}
