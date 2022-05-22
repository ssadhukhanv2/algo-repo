package com.ssadhukhanv2.algo.algorepo.mathemetics;

/**
 * @author Subhrajit Sadhukhan
 */
public class NumberOfDigits {

    public static void main(String[] args) {
        System.out.println(getNumberOfDigits_O1_Completxity(89067));
        System.out.println(getNumberOfDigits_Od_Completxity(89067));
    }

    public static long getNumberOfDigits_O1_Completxity(long n) {
        //Time Complexity is Θ(1)
        return (long) Math.floor(Math.log10(n) + 1);
    }

    public static long getNumberOfDigits_Od_Completxity(long n) {
        //Time Complexity is Θ(d), where d is the number of Digit

        // d=log10(n)
        // So Complexity 0(log10 n)
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
