package com.company;

import java.util.Arrays;

public class FindLargestNums {

    /*
    Create a function that takes an array of arrays with numbers.
    Return a new (single) array with the largest numbers of each

    findLargestNums([[4, 2, 7, 1], [20, 70, 40, 90], [1, 2, 0]]) ➞ [7, 90, 2]

    findLargestNums([[-34, -54, -74], [-32, -2, -65], [-54, 7, -43]]) ➞ [-34, -2, 7]

    findLargestNums([[0.4321, 0.7634, 0.652], [1.324, 9.32, 2.5423, 6.4314], [9, 3, 6, 3]]) ➞ [0.7634, 9.32, 9]
    */

    public static double[] findLargestNums(double[][] arr) {

        double[] numbers;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            numbers = new double[arr.length];
            System.out.println(Arrays.toString(numbers));

        }

        return null;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(findLargestNums(new double[][]{{4, 2, 7, 1}, {20, 70, 40, 90}, {1, 2, 0}})));

    }
}
