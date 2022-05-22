package com.ssadhukhanv2.algo.algorepo.recursion;

/**
 * @author Subhrajit Sadhukhan
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialTailedRecursive(5, 1));
    }

    public static int factorial(int n) {
        //Not tail recursive
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int factorialTailedRecursive(int n, int k) {
        if (n == 0 || n == 1) {
            return k;
        }
        return factorialTailedRecursive(n - 1, n * k);
    }
}
