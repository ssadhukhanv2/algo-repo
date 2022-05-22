package com.ssadhukhanv2.algo.algorepo.mathemetics;

import java.util.Arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class PrintPrimeNumbersWithinARange {
    public static void main(String[] args) {
        seiveOfEratosthenes(13);
    }

    public static void seiveOfEratosthenes(int n) {
        //Seive of Eratosthenes for Finding Prime Number
        //Complexity nlog(log(n))

        boolean[] arrPostion = new boolean[n + 1];
        Arrays.fill(arrPostion, true);
        //ignore the first 2 blocks
        for (int i = 2; i * i <= n; i++) {
            if (arrPostion[i]) {
                for (int j = i * i; j < n + 1; j += i) {
                    arrPostion[j] = false;
                }
            }
        }
        for (int i = 2; i < n + 1; i++) {
            if (arrPostion[i]) {
                System.out.print(i + " ");
            }
        }
    }

}
