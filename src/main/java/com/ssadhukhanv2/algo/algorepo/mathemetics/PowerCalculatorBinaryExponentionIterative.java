package com.ssadhukhanv2.algo.algorepo.mathemetics;

/**
 * @author Subhrajit Sadhukhan
 */
public class PowerCalculatorBinaryExponentionIterative {
    public static void main(String[] args) {
        System.out.println(power(3, 5));
    }

    private static long power(long x, long n) {
        //Time Complexity O log(n)
        //Auxilary Space O(1)
        long result = 1;
        while (n > 0) {
            if (n % 2 != 0)
                result = result * x;
            x = x * x;
            n = n / 2;
        }
        return result;
    }
}
