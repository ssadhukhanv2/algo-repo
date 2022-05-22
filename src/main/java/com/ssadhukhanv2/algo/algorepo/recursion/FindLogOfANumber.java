package com.ssadhukhanv2.algo.algorepo.recursion;

/**
 * @author Subhrajit Sadhukhan
 */
public class FindLogOfANumber {
    //We are assuming base of the log as 2 but it can be done with any other number
    public static int findFloorLogBase2(int n) {
        if (n == 1) {
            return 0;
        }
        return 1 + findFloorLogBase2(n / 2);//Here base is 2, however same algorithm can be implemented for any other base
    }

    public static void main(String[] args) {
        System.out.println(findFloorLogBase2(31));
        System.out.println(findFloorLogBase2(32));
    }
}
