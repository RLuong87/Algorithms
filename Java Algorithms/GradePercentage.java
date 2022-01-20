package com.company;

public class GradePercentage {

    /*
    This code is a direct translation from the Python version of this challenge to a Java version.
    However, because of the differences between the languages and how they function, the Java code is much harder to understand

    For example, the short, easy to read statment in Python int(userScore[:-1])
    becomes Integer.parseInt(userScore.substring(0,userScore.length()) in Java.

    END TRANSLATOR'S NOTE

    The challenge is to fix all the bugs in this incredibly messy code, which the code in the image might've actually looked like
    (probably not)! The code given will output the same middle two lines as in the image shown above.

    First parameter is the user's score.
    Second parameter is the required score.
    Examples
    grade_percentage("85%", "85%") ➞ "You PASSED the Exam"

    grade_percentage("99%", "85%") ➞ "You PASSED the Exam"

    grade_percentage("65%", "90%") ➞ "You FAILED the Exam"

    Notes:
    Note that inputs will be given as a string percentage number.
    Maintain all capitalization.
    Feel free to declutter and refactor code if it helps!
     */

    public static String gradePercentage(String userScore, String passScore){
        String s = "";
        if (Integer.parseInt(userScore.substring(0,userScore.length())) <= Integer.parseInt(passScore.substring(0,passScore.length()))){
            s += "PASSED";
        }
        if (Integer.parseInt(userScore.substring(0,userScore.length())) >= Integer.parseInt(passScore.substring(0,passScore.length()))){
            s += "FAILED";
        }
        return "You " + s + " the Exam";
    }

    public static void main(String[] args) {

        System.out.println(gradePercentage());
    }
}
