package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstVowels {

    /*
    Edabit Challenge

    Write a function that returns the first n vowels of a string.

    Examples:
    firstNVowels("sharpening skills", 3) ➞ "aei"

    firstNVowels("major league", 5) ➞ "aoeau"

    firstNVowels("hostess", 5) ➞ "invalid"

    Notes:
    Return "invalid" if the n exceeds the number of vowels in a string.
    Vowels are: a, e, i, o, u
    */

    public static String firstNVowels(String str, int n) {

        String vowel = "aeiou";
        char[] chars = str.toCharArray(); // Look at each string
        String vow = "";

        for (int i = 0; i < n; i++) {

            if (chars.length == n && chars.length == vowel.length()) {
                vow += chars[i];
                return vow;
            }
        }
        return "invalid";
    }

    public static void main(String[] args) {

//        System.out.println(firstNVowels("sharpening skills", 3));
//        String[] vowArray = vowel.split("");
//        char[] chars = str.toCharArray();
//        System.out.println(Arrays.toString(chars));
//        System.out.println(Arrays.toString(newStr));
//        System.out.println(Arrays.toString(vowArray));

        char num = 3;
//        String str = "sharpening skills";
        String str = "major league";
        String[] newStr = str.split("");

        StringBuilder vow = new StringBuilder();

        for (String s : newStr) {
            char chars = s.charAt(0);

            if (chars == 'a' || chars == 'e' || chars == 'i' || chars == 'o' || chars == 'u') {
                vow.append(s);
                num++;
            }
        }
        System.out.println(vow);
        System.out.println(num);
    }
}
