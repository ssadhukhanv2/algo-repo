package com.ssadhukhanv2.algo.algorepo.recursion;

/**
 * @author Subhrajit Sadhukhan
 */
public class RecursionBasicPractice {
    public static void main(String[] args) {
        funcPrintNumbers(5);
        System.out.println();
        funcPrintNumbers1(5);
    }

    public static void funcPrintNumbers(int n) {
        //Prints 5 4 3 2 1 1 2 3 4 5
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        funcPrintNumbers(n - 1);
        System.out.print(n + " ");
    }


    public static void funcPrintNumbers1(int n) {
        //Prints 1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 5 1 2 1 3 1 2 1 4 1 2 1 3 1 2 1
        if (n == 0) return;
        funcPrintNumbers1(n - 1);
        System.out.print(n + " ");
        funcPrintNumbers1(n - 1);
    }
}
