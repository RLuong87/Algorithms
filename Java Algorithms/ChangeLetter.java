package com.company;

public class ChangeLetter {

    /*Write a function that changes every letter to the next letter:

            "a" becomes "b"
            "b" becomes "c"
            "d" becomes "e"
    and so on ...
    Examples
    move("hello") ➞ "ifmmp"

    move("bye") ➞ "czf"

    move("welcome") ➞ "xfmdpnf"*/

    public static String move(String word) {

        int num = 1;

        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] += num;
        }
        return "";
    }

    public static void main(String[] args) {

//        ChangeLetter.move("hello");
        int num = 1;
        String str = "hello";

        String[] newStr = str.split("");
        String message = "";

        for (int i = 0; i < newStr.length; i++) {

        }
        for (int i = 0; i < newStr.length; i++) {

        }
    }
}
