package com.ssadhukhanv2.algo.algorepo.bitwise;

import java.util.ArrayList;

/**
 * @author Subhrajit Sadhukhan
 */
public class PrintPowerSet {
    public static void main(String[] args) {
        printPowerSet("arwt");
    }

    static void printPowerSet(String str) {
//        Complexity O( Math.pow(2,n) * n)

        int n = str.length();
        int numberOfElementsInPowerSet = (int) Math.pow(2, n); //powerset of string of size n will have Math.pow(2,n) subsets

        for (int counter = 0; counter < numberOfElementsInPowerSet; counter++) {
            System.out.print(counter + " " + Integer.toBinaryString(counter) + " ");
            for (int j = 0; j < numberOfElementsInPowerSet; j++) {
                if ((counter & (1 << j)) != 0) {
                    System.out.print(str.substring(j, j + 1));
                }
            }
            System.out.println();
        }
    }
}
