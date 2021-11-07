package com.company;

import java.util.*;

public class InstantJazz {


    /*
    Edabit Challenge

    Create a function which concatenates the number 7 to the end of every chord in an array.
    Ignore all chords which already end with 7.

    Examples:
    jazzify(["G", "F", "C"]) ➞ ["G7", "F7", "C7"]

    jazzify(["Dm", "G", "E", "A"]) ➞ ["Dm7", "G7", "E7", "A7"]

    jazzify(["F7", "E7", "A7", "Ab7", "Gm7", "C7"]) ➞ ["F7", "E7", "A7", "Ab7", "Gm7", "C7"]

    jazzify([]) ➞ []

    Notes:
    Return an empty array if the given array is empty.
    You can expect all the tests to have valid chords.
    */

    public static String[] jazzify(String[] arr) {

        String[] addSeven = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].matches(".*\\d.*")) {
                return arr;
            }
            if (!arr[i].matches(".*\\d.*")) {
                arr[i] += 7;
            }
            return arr;
        }
        return new String[0];
    }

    public static void main(String[] args) {

        String[] strings = {"F7", "E7", "A7", "Ab7", "Gm7", "C7"};
        System.out.println(Arrays.toString(jazzify(strings)));
        System.out.println(Arrays.toString(jazzify(new String[]{"G", "F", "C"})));

//        String[] strings = {"F7", "E7", "A7", "Ab7", "Gm7", "C7"};
//        System.out.println(Arrays.toString(jazzify(strings)));

        List<String> jazzSeven = new ArrayList<>();
        String addSeven = "7";

        for (int i = 0; i < strings.length; i++) {

            if (Objects.equals(strings[i], "7")) {
                System.out.println(jazzSeven);
            } else {
                strings[i] += addSeven;
                jazzSeven.add(strings[i]);
            }
        }
//        System.out.println(jazzSeven);
    }
}
