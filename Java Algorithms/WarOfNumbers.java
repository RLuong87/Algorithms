package com.company;

public class WarOfNumbers {

//    There's a great war between the even and odd numbers.
//    Many numbers already lost their lives in this war, and it's your task to end this.
//    You have to determine which group sums larger: the even, or the odd. The larger group wins.
//
//    Create a function that takes an array of integers, sums the even and odd numbers separately,
//    then returns the difference between sum of even and odd numbers.
//
//            Examples
//    warOfNumbers([2, 8, 7, 5]) ➞ 2
//// 2 + 8 = 10
//// 7 + 5 = 12
//// 12 is larger than 10
//// So we return 12 - 10 = 2
//
//    warOfNumbers([12, 90, 75]) ➞ 27
//
//    warOfNumbers([5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243]) ➞ 168

    public static int warOfNumbers(int[] numbers) {
        int evenSum = 0, oddSum = 0, even = 0, odd = 0;

        for (int num : numbers) {

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        if (evenSum > oddSum) {
            even = (evenSum - oddSum);
        } else {
            odd = (oddSum - evenSum);
        }
        if (even > odd) {
            return even;
        } else {
            return odd;
        }
//        return Math.max(even, odd); // Alternative
    }

    public static void main(String[] args) {

//        System.out.println(warOfNumbers(new int[]{2, 8, 7, 5}));
//        System.out.println(warOfNumbers(new int[]{5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243}));
//        System.out.println(warOfNumbers(new int[]{12, 90, 75}));

        int evenSum = 0, oddSum = 0, even = 0, odd = 0;
//        int[] numbers = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
//        int[] numbers = {12, 90, 75};
        int[] numbers = {2, 8, 7, 5};

        for (int number : numbers) {

            if (number % 2 == 0) {
                evenSum += number;
//                System.out.println(number + " " + evenSum);
            } else {
                oddSum += number;
//                System.out.println(number + " " + oddSum);
            }
        }
        if (evenSum > oddSum) {
            even = (evenSum - oddSum);
        } else {
            odd = (oddSum - evenSum);
//                System.out.println(odd);
        }

//        if (even > odd) {
//            System.out.println("Even numbers win with a score of " + even);
//        } else {
//            System.out.println("Odd numbers win with a score of " + odd);

//        System.out.println(odd);
//        System.out.println(even);
        System.out.println(evenSum > oddSum ? (evenSum - oddSum) : (oddSum - evenSum));
//        }
    }
}
