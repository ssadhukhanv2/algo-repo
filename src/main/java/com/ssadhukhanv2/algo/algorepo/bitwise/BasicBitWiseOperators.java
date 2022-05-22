package com.ssadhukhanv2.algo.algorepo.bitwise;

/**
 * @author Subhrajit Sadhukhan
 */
public class BasicBitWiseOperators {
    public static void main(String[] args) {

        int x = 3, y = 6;
        //NOT
        //https://practice.geeksforgeeks.org/tracks/DSASP-BitMagic/?batchId=154&tab=1
        //Inverts every bit
        System.out.println(~1);
        System.out.println(~5);

        //Left Shift for positive/negative number
        // 6    -> 000000110
        // 6<<3 -> 000110000 -> 48
        // However for large numbers this may not work as the leading bits may get mixed up with the sign bits
        System.out.println(y << x); //multiplied by 2, n times, here n=3S
        System.out.println(((-1) * y) << x); //multiplied by 2, n times, here n=3S


        //Right Shift (Incase of negative number, the sign bit is presevered)
        System.out.println(16 >> 3); // 16/(2*2*2) = 2
        System.out.println(-2 >> 3); // -1

        //Unsigned Right Shift (Leading bits are always filled with 0 so the sign is not preserved)
        System.out.println(16 >>> 3); // 16/(2*2*2) = 2
        System.out.println(-2 >>> 3); // 1




        // AND
        // 1&1=1 1&0=0 0&1=0 0&0=0
        // 3   =011
        // 6   =110
        // 3&6 =010 =2
        System.out.println(x & y);

        // OR
        // 1|1=1 1|0=1 0|1=1 0&0=0
        // 3   =011
        // 6   =110
        // 3&6 =111 =7
        System.out.println(x | y);


        // XOR
        // 1^1=0 1^0=1 0^1=1 0^0=0
        // 3   =011
        // 6   =110
        // 3&6 =101 =5
        System.out.println(x ^ y);


    }

}
