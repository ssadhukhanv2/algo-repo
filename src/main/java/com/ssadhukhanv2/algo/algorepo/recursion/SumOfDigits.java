package com.ssadhukhanv2.algo.algorepo.recursion;

/**
 * @author Subhrajit Sadhukhan
 */
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(156));
        System.out.println(sumOfDigitsNonRecursive(156));
    }

    public static int sumOfDigits(int n) {
        //Time Complexity O(d) where d is the number of digits
        //Auxilary Space O(d)
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    public static int sumOfDigitsNonRecursive(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;


    }
}
