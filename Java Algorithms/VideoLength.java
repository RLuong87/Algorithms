package com.company;

import java.util.Arrays;

public class VideoLength {

    /*
    Edabit Challenge

    You are given the length of a video in minutes. The format is mm:ss (e.g.: "02:54").
    Create a function that takes the video length and return it in seconds.

    Examples:
    minutesToSeconds("01:00") ➞ 60

    minutesToSeconds("13:56") ➞ 836

    minutesToSeconds("10:60") ➞ -1

    Notes:
    The video length is given as a string.
    If the number of seconds is 60 or over, return -1 (see example #3).
    You may get a number of minutes over 99 (e.g. "121:49" is perfectly valid)
     */

    public static int minutesToSeconds(String tm) {

        String fm = tm.replaceAll("\\D+", ""); // This will ignore the colon with regex and take just the numbers
        String[] numArr = fm.split(""); // Split the string of numbers

        String[] num1 = new String[2]; // To hold the first two numbers of the string, which represents the minutes
        num1[0] = numArr[0];
        num1[1] = numArr[1];

        String[] num2 = new String[2]; // Holds the remaining two numbers which represents the seconds
        num2[0] = numArr[2];
        num2[1] = numArr[3];

        String num1Str = "";
        String num2Str = "";

        for (int i = 0; i < 2; i++) {
            num1Str += num1[i]; // Combines the minutes in a new string
            num2Str += num2[i]; // Combines the seconds in a new string
        }

        int seconds = Integer.parseInt(num2Str); // Parse the minutes
        int minutes = Integer.parseInt(num1Str); // Parse the seconds
        int mToS = (minutes * 60) + seconds;

        for (int i = 0; i < seconds; i++) {
            if (seconds >= 60) {
                return -1;
            }
        }
        return mToS;
    }

    public static void main(String[] args) {
        System.out.println(minutesToSeconds("13:56"));
        System.out.println(minutesToSeconds("01:00"));
        System.out.println(minutesToSeconds("10:60"));
//        System.out.println(13 * 60);
//        System.out.println(780 + 56);

//        Using regex to get just the integers from a string (replaceAll) method
//        regex:
//        "\\D+", replacement:empty string
        String s = "01:00";
        s = s.replaceAll("\\D+", "");
        String[] numArr = s.split("");

        String[] num1 = new String[2];
        num1[0] = numArr[0];
        num1[1] = numArr[1];

        String[] num2 = new String[2];
        num2[0] = numArr[2];
        num2[1] = numArr[3];

        String num1Str = "";
        String num2Str = "";

        for (int i = 0; i < num1.length; i++) {
            num1Str += num1[i];
            num2Str += num2[i];
        }
        int seconds = Integer.parseInt(num2Str);
        int x = Integer.parseInt(num1Str);
        int minutes = (x * 60);

//        System.out.println(minutes + seconds);
    }
}
