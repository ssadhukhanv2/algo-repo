package com.ssadhukhanv2.algo.algorepo.bitwise;

/**
 * @author Subhrajit Sadhukhan
 */
public class CheckTwoOddOccuringNumberInAnArray {
    public static void main(String[] args) {
        int[] array1 = new int[]{4, 3, 4, 4, 4, 5, 5, 21, 3, 3};
        int[] array2 = new int[]{4, 3, 3, 4, 4, 4, 5, 5, 2, 90};
        checkTwoOddOccuringNumberInAnArray(array1);
        checkTwoOddOccuringNumberInAnArray(array2);
    }

    public static void checkTwoOddOccuringNumberInAnArray(int[] arr) {
        //Find the right most set bit for the numbers in the array
        int xorArr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xorArr ^= arr[i];
        }
        int rightMostSetBitNumber = xorArr & (~(xorArr - 1));


        //Divide the elements of the array in 2 groups
        // group a -> right most bit set
        // group b -> right most bit not set
        // xor the elements in each group to get the odd occuring numbers
        int firstOfTheTwoOddOccuringNumber = 0;
        int secondOfTheTwoOddOccuringNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((rightMostSetBitNumber & arr[i]) != 0) {
                firstOfTheTwoOddOccuringNumber ^= arr[i];
            } else {
                secondOfTheTwoOddOccuringNumber ^= arr[i];
            }
        }
        System.out.println(firstOfTheTwoOddOccuringNumber);
        System.out.println(secondOfTheTwoOddOccuringNumber);
    }
}
