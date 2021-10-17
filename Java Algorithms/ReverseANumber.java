package com.company;

public class ReverseANumber {

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

        return "";
    }

    public static void main(String[] args) {

        String number = "1215";
        String strNum = "";
        String[] numArr = number.split("");

        for (int i = numArr.length - 1; i >= 0; i++) {
            strNum += numArr[i];
        }
        System.out.println(strNum);
    }
}
