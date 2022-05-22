package com.ssadhukhanv2.algo.algorepo.mathemetics;

/**
 * @author Subhrajit Sadhukhan
 */
public class CheckPrimeNumber {
    public static void main(String[] args) {
        int n = 29;
        System.out.println(checkPrime(n));
    }

    public static boolean checkPrime(int n) {
        //Time complexity: Θ(Math.sqrt(n))
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i+=6) {
            if (n % i == 0 || n % i + 2 == 0)
                return false;
        }
        return true;
    }
}
