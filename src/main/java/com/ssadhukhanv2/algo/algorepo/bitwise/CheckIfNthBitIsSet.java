package com.ssadhukhanv2.algo.algorepo.bitwise;

/**
 * @author Subhrajit Sadhukhan
 */
public class CheckIfNthBitIsSet {
    public static void main(String[] args) {
        //Check if kth bit is set to 1
        int n = 5;
        int k = 3;
        System.out.println(checkSetBitLeftShift(n, k));
        System.out.println(checkSetBitRightShift(n, k));
    }

    public static boolean checkSetBitLeftShift(int n, int k) {
        // n=5 & k=3
        // 1      = 0001
        // 1<<k-1 = 0100
        // 5      = 0101
        // 5&(1<<k-1) = 0100, which is nonzero so kth bit is set
        return (n & (1 << (k - 1))) != 0;
    }

    public static boolean checkSetBitRightShift(int n, int k) {
        // n=5 & k=3
        // 5        = 0101
        // 5>>(k-1) = 0001 //So here we shift the kth bit to the 1st bit
        // 1        = 0001
        // (5>>(k-1))&1 = 0001, which is nonzero so kth bit is set
        return ((n >> (k - 1)) & 1) != 0;
    }
}
