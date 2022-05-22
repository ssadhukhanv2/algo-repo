package com.ssadhukhanv2.algo.algorepo.recursion;

/**
 * @author Subhrajit Sadhukhan
 */
public class PrintNumber {
    public static void main(String[] args) {
        print1toN(5);
        System.out.println();
        printNto1(5);
        System.out.println();
        print1toNTailedRecursive(5, 1);
    }


    public static void print1toNTailedRecursive(int n, int k) {
        //Modified print1toN to create a tailed recursive function
        //A function is called tail recursive when the last thing that happens in the function call is the recursive call
        if (n == 0) return;
        System.out.print(k + " ");
        print1toNTailedRecursive(n - 1, k + 1);
    }

    public static void print1toN(int n) {
        // Non-tail recursive
        // T(n) = T(n-1)+θ(1)
        // Time Complexity O(n)
        // Auxilary Space O(n+1)
        if (n == 0) return;
        print1toN(n - 1);
        System.out.print(n + " ");
    }

    public static void printNto1(int n) {
        // T(n) = T(n-1)+θ(1)
        // Time Complexity O(n)
        // Auxilary Space O(n)
        if (n == 0) return;
        System.out.print(n + " ");
        printNto1(n - 1);
    }
}
