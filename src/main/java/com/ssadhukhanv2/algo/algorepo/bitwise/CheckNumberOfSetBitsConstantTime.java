package com.ssadhukhanv2.algo.algorepo.bitwise;

import java.util.Arrays;
import java.util.List;

/**
 * @author Subhrajit Sadhukhan
 */
public class CheckNumberOfSetBitsConstantTime {
    static Integer[] table = new Integer[256];

    public static void initialize() {
        table[0] = 0;
        for (int i = 0; i < table.length; i++) {
            table[i] = (i & 1) + table[i / 2];
        }
    }


    public static int countSetBits(int n) {
        int setBitTotal = table[n % 0xff]
                + table[(n >> 8) % 0xff]
                + table[(n >> 16) % 0xff]
                + table[(n >> 24) % 0xff];
        ;
        return setBitTotal;
    }

    public static void main(String[] args) {

        initialize();
        System.out.println(countSetBits(7));
    }


}
