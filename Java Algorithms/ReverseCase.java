package com.company;

import java.util.Arrays;
import java.util.Locale;

public class ReverseCase {

    /*
    Edabit Challenge

    Given a string, create a function to reverse the case. All lower-cased letters should be upper-cased, and vice versa.

    Examples:
    reverseCase("Happy Birthday") ➞ "hAPPY bIRTHDAY"

    reverseCase("MANY THANKS") ➞ "many thanks"

    reverseCase("sPoNtAnEoUs") ➞ "SpOnTaNeOuS"
    */
    public static String reverseCase(String str) {

        char[] chars = str.toCharArray();
        String capStr = "";
        String lowStr = "";

        for (int i = 0; i < chars.length; i++) {

            if (Character.isUpperCase(chars[i]))

                capStr += chars[i];
            else
                lowStr += chars[i];
        }
        return capStr.toLowerCase() + " " + lowStr.toUpperCase();
    }

    public static void main(String[] args) {

        System.out.println(reverseCase("Happy Birthday"));
        System.out.println(reverseCase("MANY THANKS"));
        System.out.println(reverseCase("sPoNtAnEoUs"));

        String str = "Happy Birthday";
        char[] chars = str.toCharArray();
        StringBuilder capStr = new StringBuilder();
        StringBuilder lowStr = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                capStr.append(chars[i]);
            } else {
                lowStr.append(chars[i]);
            }
        }
//        System.out.println(chars);

//        System.out.println(capStr + "\n" + lowStr);

//        for (String s : newStr) {
////            if (Character.isUpperCase(s.charAt(0)))
////                capStr.append(s);
//            else
//                lowStr.append(s);
//        }
    }
}
