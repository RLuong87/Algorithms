package com.company;

import java.util.Arrays;
import java.util.Collections;

public class SortNumbersAscendingOrder {

    /*
    Edabit Challenge

    Create a method that takes an array of integers and returns a new array, sorted in ascending order (smallest to biggest).

    Sort integer array in ascending order.
    If the function's argument is null, an empty array, or undefined; return an empty array.
    Return a new array of sorted numbers.

    Examples:
    sortNumsAscending([1, 2, 10, 50, 5]) ➞ [1, 2, 5, 10, 50]

    sortNumsAscending([80, 29, 4, -95, -24, 85]) ➞ [-95, -24, 4, 29, 80, 85]

    sortNumsAscending(null) ➞ []

    sortNumsAscending([]) ➞ []
     */

    public static int[] sortNumsAscending(int[] nums) {

        int[] sortedNumbers = new int[0];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            sortedNumbers = nums;
        }
        return sortedNumbers;
    }

    public static void main(String[] args) {

        int[] newArr = {};
        int[] x = {80, 29, 4, -95, -24, 85};
        System.out.println(Arrays.toString(sortNumsAscending(x)));

        Arrays.sort(x);
//        System.out.println(Arrays.toString(x));
    }
}
