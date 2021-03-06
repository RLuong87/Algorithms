import java.util.*;

//Create a function that takes two numbers as arguments (num, length)
// and returns an array of multiples of num until the array length reaches length.

//    arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]

//    arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]

//    arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]

public class ArrayOfMultiples {

    public int[] arrayOfMultiples(int num, int length) {

        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + 1) * num;
        }
        return numbers;
    }
}