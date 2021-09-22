package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLargestNums {

    /*
    Edabit Challenge

    Create a function that takes an array of arrays with numbers.
    Return a new (single) array with the largest numbers of each

    findLargestNums([[4, 2, 7, 1], [20, 70, 40, 90], [1, 2, 0]]) ➞ [7, 90, 2]

    findLargestNums([[-34, -54, -74], [-32, -2, -65], [-54, 7, -43]]) ➞ [-34, -2, 7]

    findLargestNums([[0.4321, 0.7634, 0.652], [1.324, 9.32, 2.5423, 6.4314], [9, 3, 6, 3]]) ➞ [0.7634, 9.32, 9]
    */

    public static int[] findLargestNums(double[][] arr) {

        return null;
    }

    public static void main(String[] args) {

        // Create a list to place the biggest numbers when found
        List<Integer> biggestNumbers = new ArrayList<>();
        int[][] numbers = {{4, 2, 7, 1}, {20, 70, 40, 90}, {1, 2, 0}};

        for (int[] number : numbers) {
            int numCheck = number[0];

            for (int num : number) {
                if (num > numCheck) {
                    numCheck = num;
                }
            }
            biggestNumbers.add(numCheck);
        }
        System.out.println(biggestNumbers);
    }
}
