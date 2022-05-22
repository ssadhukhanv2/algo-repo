package com.ssadhukhanv2.algo.algorepo.intro;

import java.util.function.Function;

/**
 * @author Subhrajit Sadhukhan
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacciSum_VariableAuxilarySpace(5));
        System.out.println(fibonacciSum_ConstantAuxilarySpace(5));
    }

    static int fibonacciSum_VariableAuxilarySpace(int n) {
        // Auxiliary Space is n
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciSum_VariableAuxilarySpace(n - 1) + fibonacciSum_VariableAuxilarySpace(n - 2);
    }

    static int fibonacciSum_ConstantAuxilarySpace(int n) {
        // Auxiliary Space is n
        if (n == 0 || n == 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
}
