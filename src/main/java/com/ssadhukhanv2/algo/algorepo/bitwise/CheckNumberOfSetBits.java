package com.ssadhukhanv2.algo.algorepo.bitwise;

/**
 * @author Subhrajit Sadhukhan
 */
public class CheckNumberOfSetBits {
    public static void main(String[] args) {
        int n = 18;
        System.out.println(checkSetBitsNaive(n));
        System.out.println(checkSetBitsBrianKerningam(n));
        System.out.println(Integer.toBinaryString(n));
    }

    public static int checkSetBitsBrianKerningam(int n) {
        //Complexity O(Number of set bits in n)
        //Count =1
        //  n     = 9 = 1001
        // n-1    = 8 = 1000
        // n&n-1  = 8 = 1000
        // second iteration
        //Count =2
        //  n     = 8 = 1000
        // n-1    = 7 = 0111
        // n&n-1  = 8 = 0000
        // Comes out of the loop

        int count = 0;
        while (n > 0) {
            count++;
            n = n & (n - 1);
        }
        return count;

    }


    public static int checkSetBitsNaive(int n) {
        //Complexity is O(number of bits in n)
        //at each iteration check if the last bit is set and increase the counter
        //right shift the bit once in each iteration
        int count = 0;
        while (n > 0) {
            if (n % 2 != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
