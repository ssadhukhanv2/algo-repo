package com.ssadhukhanv2.algo.algorepo.recursion;

/**
 * @author Subhrajit Sadhukhan
 */
public class PrintBinaryRepresentationOfANumber {
    public static void main(String[] args) {
        printBinary(16);
    }

    private static void printBinary(int n) {
        if (n == 0) {
            return;
        }
        printBinary(n / 2);
        System.out.print(n % 2);
    }
}
