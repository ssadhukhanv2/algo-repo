package com.ssadhukhanv2.algo.algorepo.recursion;

/**
 * @author Subhrajit Sadhukhan
 */
public class RopeCuttingProblem {
    public static void main(String[] args) {
        int ropeSize = 9;
        int a = 3, b = 2, c = 4;
    }

    public static int cutRopes(int ropeSize, int a, int b, int c) {
        //Time Complexity O(Math.pow(3,n)) where n is the size of the rope
        if (ropeSize < 0) {
            return -1;
        }
        if (ropeSize == 0) {
            return 0;
        }
        int ropeSizeAfterCuttingByA = cutRopes(ropeSize - a, a, b, c);
        int ropeSizeAfterCuttingByB = cutRopes(ropeSize - b, a, b, c);
        int ropeSizeAfterCuttingByC = cutRopes(ropeSize - c, a, b, c);
        int maxRopeSizeAfterCuttingByABC = Math.max(ropeSizeAfterCuttingByA, Math.max(ropeSizeAfterCuttingByB, ropeSizeAfterCuttingByC));
        if (maxRopeSizeAfterCuttingByABC == -1) {
            return -1;
        }
        return maxRopeSizeAfterCuttingByABC + 1;
    }
}
