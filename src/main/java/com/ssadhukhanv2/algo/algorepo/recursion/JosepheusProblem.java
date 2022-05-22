package com.ssadhukhanv2.algo.algorepo.recursion;

/**
 * @author Subhrajit Sadhukhan
 */
public class JosepheusProblem {
    public static void main(String[] args) {
        System.out.println(josephus(5, 3)); //Assumes the index starting at 0
        System.out.println(josephusIndexStartingAt(5, 3, 1));//Start index is passed as input
    }

    private static int josephus(int n, int k) {
        //T(n)=T(n-1)+c
        if (n == 1) {
            return 0;
        }
        return (josephus(n - 1, k) + k) % n;
    }

    private static int josephusIndexStartingAt(int n, int k, int startingIndex) {
        return josephus(n, k) + startingIndex;
    }
}
