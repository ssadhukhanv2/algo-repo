package com.ssadhukhanv2.algo.algorepo.mathemetics;

/**
 * @author Subhrajit Sadhukhan
 */
public class TrailingZerosInFactorial {

    public static void main(String[] args) {
        int n = 100;
        String output = "Factorial of " + n + " has " + findTrailingZerosInFactorial_Olog5N(n) + " Trailing Zeros";
        System.out.println(output);
    }

    private static int findTrailingZerosInFactorial_Olog5N(int n) {
        //Time complexity: Θ(log5(n))
        //Solves problems with buffer overflow of Factorial Function
        int trailingZeros = 0;
        for (int i = 5; i <= n; i *= 5) {
            trailingZeros = trailingZeros + n / i;
        }
        return trailingZeros;
    }

    private static long fact(long n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return n * fact(n - 1);

    }
}
