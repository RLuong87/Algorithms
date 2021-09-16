package com.company;

import java.util.Arrays;

public class PuzzlePieces {

    /*
    Write a function that takes two arrays and adds the first element in the first array with the first element in the second array,
    the second element in the first array with the second element in the second array, etc., etc.
    Return true if all element combinations add up to the same number. Otherwise, return false.

    Examples
    puzzlePieces([1, 2, 3, 4], [4, 3, 2, 1]) ➞ true
    1 + 4 = 5;  2 + 3 = 5;  3 + 2 = 5;  4 + 1 = 5
    Both arrays sum to [5, 5, 5, 5]

    puzzlePieces([1, 8, 5, 0, -1, 7], [0, -7, -4, 1, 2, -6]) ➞ true

    puzzlePieces([1, 2], [-1, -1]) ➞ false

    puzzlePieces([9, 8, 7], [7, 8, 9, 10]) ➞ false
    */

    public static boolean puzzlePieces(int[][] n) {

        return true;
    }

    public static void main(String[] args) {

        int[][] numbers = { { 1, 2, 3, 4 }, { 4, 3, 2, 1 } };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(new int[]{numbers[i][0]}));

            for (int j = 0; j < numbers.length; j++) {
                System.out.println(Arrays.deepToString(new int[][]{numbers[j]}));
            }
        }
    }
}
