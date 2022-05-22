package com.ssadhukhanv2.algo.algorepo.recursion;

/**
 * @author Subhrajit Sadhukhan
 */
public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        int sum = sumNaturalNumberTailed(5, 0);
        System.out.println(sum);
        sum = sumNaturalNumber(5);
        System.out.println(sum);
    }

    private static int sumNaturalNumber(int n) {
        //O(n)
        if (n == 1) {
            return n;
        }
        return n+sumNaturalNumber(n - 1);
    }
    private static int sumNaturalNumberTailed(int n, int k) {
        if (n == 0) {
            return k;
        }
        return sumNaturalNumberTailed(n - 1, k + n);
    }
}
