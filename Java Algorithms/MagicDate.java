package com.company;

import java.util.Arrays;

public class MagicDate {

    /*
    Edabit Challenge
    https://edabit.com/challenge/g7dRyiCi5dpKxuFRa

    You are to read each part of the date into its own integer type variable. The year should be a 4-digit number.
    You can assume the user enters a correct date formatted d m yyyy (no error checking required).

    Determine whether the entered date is a magic date. Here are the rules for a magic date:

    mm * dd is a 1-digit number that matches the last digit of yyyy or
    mm * dd is a 2-digit number that matches the last 2 digits of yyyy or
    mm * dd is a 3-digit number that matches the last 3 digits of yyyy
    The program should then display true if the date is magic, or false if it is not.

    Examples:
    Magic("1 1 2011") ➞ true

    Magic("4 1 2001") ➞ false

    Magic("5 2 2010") ➞ true

    Magic("9 2 2011") ➞ false
     */

    public static boolean magic(String str) {


        return true;
    }

    public static void main(String[] args) {

        String str = "112011";
        String[] strNumbers = str.split("");
        int n;
        int[] numbers = new int[0];

        for (int i = 0; i < strNumbers.length; i++) {
            n = Integer.parseInt(strNumbers[i]);
            numbers = new int[]{i};
        }
    }
}
