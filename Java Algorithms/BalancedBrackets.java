package com.company;

import java.io.*;
import java.io.*;
import java.util.stream.IntStream;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

public class BalancedBrackets {

    /*
    ATTENTION CLIFF: THIS IS NOT A WORKING SOLUTION!


     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     *
             * STDIN           Function
        -----           --------
        3               n = 3
        {[()]}          first s = '{[()]}'
        {[(])}          second s = '{[(])}'
        {{[[(())]]}}    third s ='{{[[(())]]}}'
        *
        *
        *
        all the parentheses are matched, i.e., every opening parenthesis has a corresponding closing parenthesis.
        the matched parentheses are in the correct order, i.e., an opening parenthesis should come before the closing parenthesis.

        Create an empty stack.
        Push opening brackets on top of stack.
        In case of a closing bracket, check if the stack is empty.
        If not, pop in a closing bracket if the top of the stack contains the corresponding opening bracket.
        If the opening bracket corresponds with a closing bracket then keep checking the stack is empty
        *
        *
        *  {{}}()[()]
     */

    public static String isBalanced(String s) {

        Stack<String> balanced = new Stack<>();
        String[] splitStr = s.split("");

        for (int i = 0; i < splitStr.length; i++) {

            if (splitStr[i].equals("{") || splitStr[i].equals("[") || splitStr[i].equals("(")) {
                balanced.push(splitStr[i]);
            }
        }

        System.out.println(Arrays.toString(splitStr));
        for (int i = 0; i < splitStr.length; i++) {
            if (!balanced.isEmpty()) {
                if (balanced.peek().equals("(") && splitStr[i].equals(")")) {
                    System.out.println("Before pop: " + balanced);
                    balanced.pop();
                    System.out.println("After pop: " + balanced);
                } else if (balanced.peek().equals("[") && splitStr[i].equals("]")) {
                    System.out.println("Before pop: " + balanced);
                    balanced.pop();
                    System.out.println("After pop: " + balanced);
                } else if (balanced.peek().equals("{") && splitStr[i].equals("}")) {
                    System.out.println("Before pop: " + balanced);
                    balanced.pop();
                    System.out.println("After pop: " + balanced);
                }
            }
            if (balanced.isEmpty()) {
                return "YES";
            }
        }
        System.out.println(balanced);
        return "NO";
    }

    public static void main(String[] args) {

        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("{(([])[])[]]}"));
        System.out.println(isBalanced("{{[[(())]]}}"));


        String str = "{{[[(())]]}}";
        String[] splitStr = str.split("");
//        System.out.println("Split string: " + Arrays.toString(splitStr));

        Stack<String> balanced = new Stack<>();

//        Queue<String> q = new PriorityQueue<>();
//        q.poll();

        for (int i = 0; i < splitStr.length; i++) {

            if (splitStr[i].equals("{") || splitStr[i].equals("[") || splitStr[i].equals("(")) {
                balanced.push(splitStr[i]);
            }
        }

        for (int i = 0; i < splitStr.length; i++) {

            if (!balanced.isEmpty()) {
                if (balanced.peek().equals("(") && splitStr[i].equals(")")) {
                    balanced.pop();
                } else if (balanced.peek().equals("[") && splitStr[i].equals("]")) {
                    balanced.pop();
                } else if (balanced.peek().equals("{") && splitStr[i].equals("}")) {
                    balanced.pop();
                }
            }
        }
//        System.out.println(balanced);
//        System.out.println(balanced.isEmpty() ? "YES" : "NO");
    }

//        System.out.println(balanced);
//        System.out.println(balanced.pop());
//        System.out.println(balanced.pop());
//        System.out.println(balanced.pop());
//        System.out.println(balanced);
}

