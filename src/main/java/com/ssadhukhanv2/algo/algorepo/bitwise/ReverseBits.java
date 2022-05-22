package com.ssadhukhanv2.algo.algorepo.bitwise;

/**
 * @author Subhrajit Sadhukhan
 */
public class ReverseBits {
    public static void main(String[] args) {
        //https://leetcode.com/problems/reverse-bits/submissions/
        System.out.println(reverseBits(-3));
    }

    public static int reverseBits(int N) {
        int n = N;
        int rev = 0;
        while (n != 0) {
            //left shift rev by 1
            rev = rev << 1;
            rev = rev | (n & 1);
            n = n >>> 1;
        }
        return rev<<Integer.numberOfLeadingZeros(N);
    }

}
