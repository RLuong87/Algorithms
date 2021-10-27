package com.company;

public class ReverseTheNumber {

    /*
    Edabit Challenge

    Create a function that takes an integer n and reverses it.

    Examples:
    rev(5121) ➞ "1215"

    rev(69) ➞ "96"

    rev(-122157) ➞ "751221"

    Notes:
    This challenge is about using two operators that are related to division.
    If the number is negative, treat it like it's positive
     */

    public static String rev(int n) {

        String strNum = String.valueOf(n); // Converting the int to a string using valueOf() method
        strNum = strNum.replaceAll("-", ""); // replaceAll() method to replace all dashes present
        String[] numArr = strNum.split(""); // Convert the string to a string array
        String revNum = ""; // Empty string to concatenate the new string

        // Reverse for loop to start at the end of the string array
        for (int i = numArr.length - 1; i >= 0; i--) {
            revNum += numArr[i]; // Concatenate each element into a new string
        }
        return revNum;
    }

    public static void main(String[] args) {
        System.out.println(rev(5121));
        System.out.println(rev(69));
        System.out.println(rev(-122157));
    }
}
