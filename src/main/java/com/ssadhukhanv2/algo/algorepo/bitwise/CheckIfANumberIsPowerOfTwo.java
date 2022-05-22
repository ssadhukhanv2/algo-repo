package com.ssadhukhanv2.algo.algorepo.bitwise;

/**
 * @author Subhrajit Sadhukhan
 */
public class CheckIfANumberIsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(checkIfANumberIsPowerOfTwo_efficient(8));
        System.out.println(checkIfANumberIsPowerOfTwo_efficient(6));
//        System.out.println(checkIfANumberIsPowerOfTwo(8));
//        System.out.println(checkIfANumberIsPowerOfTwo(6));
    }


    public static boolean checkIfANumberIsPowerOfTwo_efficient(int n) {
        //If a number is a power of two then it will have one set bit
        // Modify the Brian Cunningham Algorithm
        // Unset the last set bit, if the number is zero it's a power of 2 else not
        // Complexity O(1)
        if (n == 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }


    public static boolean checkIfANumberIsPowerOfTwo(int n) {
        //If a number is a power of two then it will have one set bit
        // Complexity O(number of digits in n)
        if (n == 0) {
            return false;
        }
        return checkNumberOfSetBits_BrianCunningHam(n) == 1;
    }

    private static int checkNumberOfSetBits_BrianCunningHam(int n) {
        // Complexity O(number of digits in n)
        int count = 0;
        while (n > 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
