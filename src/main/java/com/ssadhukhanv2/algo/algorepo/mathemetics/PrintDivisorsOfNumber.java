package com.ssadhukhanv2.algo.algorepo.mathemetics;

/**
 * @author Subhrajit Sadhukhan
 */
public class PrintDivisorsOfNumber {
    public static void main(String[] args) {
        System.out.println("Unsorted:");
        printDivisors(100);
        System.out.println("Sorted:");
        printDivisorsInSortedOrder(100);
    }

    public static void printDivisorsInSortedOrder(int n) {
        int i = 1;
        for (; i * i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        for (; i > 0; i--) {
            if (n % i == 0) {
                System.out.println(n / i);
            }
        }
    }

    public static void printDivisors(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (i != n / i)
                    System.out.println(n / i);
            }
        }
    }
}
