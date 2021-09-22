package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class InstantJazz {

    //Edabit Challenge

    /*
    Create a function which concatenates the number 7 to the end of every chord in an array.
    Ignore all chords which already end with 7.

    Examples
    jazzify(["G", "F", "C"]) ➞ ["G7", "F7", "C7"]

    jazzify(["Dm", "G", "E", "A"]) ➞ ["Dm7", "G7", "E7", "A7"]

    jazzify(["F7", "E7", "A7", "Ab7", "Gm7", "C7"]) ➞ ["F7", "E7", "A7", "Ab7", "Gm7", "C7"]

    jazzify([]) ➞ []

    Notes
    Return an empty array if the given array is empty.
    You can expect all the tests to have valid chords.
    */

    public static String[] jazzify(String[] arr) {

        String[] newStrs = new String[0];
        String addSev = "7";

        for (int i = 0; i < arr.length; i++) {
            arr[i] += addSev;

        }
//        return new String[arr.length];
        return newStrs;
    }

    public static void main(String[] args) {

//        String[] strings = {"F7", "E7", "A7", "Ab7", "Gm7", "C7"};
        String[] strings = {"Dm", "G", "E", "A"};
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
        System.out.println(jazzSeven);
    }
}
