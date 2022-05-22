package com.ssadhukhanv2.algo.algorepo.mathemetics;

/**
 * @author Subhrajit Sadhukhan
 */

//DOESN'T WORK
public class NumberOfDigitsInFactorial {
    public static void main(String[] args) {
        System.out.println(digitsInFactorial(5));
    }

    public static int trailingZerosInFactorial(int n) {
        int trailingZeros = 0;
        for (int i = 5; i <= n; i *= 5) {
            trailingZeros += n / i;
        }
        return trailingZeros;
    }

    /**
     * We know,
     * log(a*b) = log(a) + log(b)
     * <p>
     * Therefore
     * log( n! ) = log(1*2*3....... * n)
     * log( n! ) = log(1) + log(2) + ........ +log(n)
     * <p>
     * Now, observe that the floor value of log base
     * 10 increased by 1, of any number, gives the
     * number of digits present in that number.
     * <p>
     * Hence, Sum of digits of a number = Math.floor(log10(n!)) + 1.
     * = Math.floor(log10(1) + log10(2) + ........ +log10(n)) + 1.
     *
     * @param n Number
     * @return
     */
    public static int digitsInFactorial(int n) {
        //Time complexity: Θ(n)
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return n;
        }

        double digits = 0;
        while (n > 0) {
            digits += Math.log10(n);
            n--;
        }

        System.out.println(digits);
        return (int) Math.floor(digits) + 1;

    }

}
