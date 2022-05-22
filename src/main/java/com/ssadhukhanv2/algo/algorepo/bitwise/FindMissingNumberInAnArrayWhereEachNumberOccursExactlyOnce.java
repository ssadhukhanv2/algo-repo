package com.ssadhukhanv2.algo.algorepo.bitwise;

/**
 * @author Subhrajit Sadhukhan
 */
public class FindMissingNumberInAnArrayWhereEachNumberOccursExactlyOnce {
    //Find the missing number in an array having numbers in range [1....n+1] where each number occurs exactly once
    public static void main(String[] args) {
        int[] arr1 = new int[]{4, 5, 6, 7, 9, 10};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 9, 10};

        System.out.println(findMissingNumberInASecquence(arr1)); //This one doesn't work
        System.out.println(findMissingNumberInASecquence(arr2));
    }

    private static int findMissingNumberInASecquence(int[] arr) {
        // setA = 1^2^3^.....n+1 <- Number is missing here
        // setB = 1^2^3^.....n+1 <-Number is not missing here
        // So setA^setB will have the missing number
        int x1 = arr[0];
        int x2 = 1;


        for (int i = 1; i < arr.length; i++) {
            x1 = x1 ^ arr[i];
        }
//        System.out.println(xorMissingNumberArray);
        for (int i = 2; i < arr.length + 2; i++) {
            x2 = x2 ^ i;
        }
//        System.out.println(xorNumberArray);
        return x1 ^ x2;

    }


}
