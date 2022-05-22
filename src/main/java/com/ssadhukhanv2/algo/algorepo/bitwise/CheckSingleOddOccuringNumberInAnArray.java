package com.ssadhukhanv2.algo.algorepo.bitwise;

import java.util.Arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class CheckSingleOddOccuringNumberInAnArray {
    public static void main(String[] args) {

        int[] array1 = new int[]{4, 3, 4, 4, 4, 5, 5, 3, 3};
        int[] array2 = new int[]{4, 3, 3, 4, 4, 4, 5, 5, 2};
        System.out.println(checkTheSingleOddOccuringNumberInArray(array1, array1.length));
        System.out.println(checkTheSingleOddOccuringNumberInArray(array2, array2.length));
    }

    public static int checkTheSingleOddOccuringNumberInArray(int[] arr, int n) {
        // XOR Properties
        // x^0 = x
        // x^y = y^x
        // x^(y^z) = (x^y)^z
        // x^x = 0
        // We use this property to count the odd occurring number
        int singleOddOccuringNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            singleOddOccuringNumber = singleOddOccuringNumber ^ arr[i];
        }
        return singleOddOccuringNumber;
    }
}
