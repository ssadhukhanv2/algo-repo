package com.ssadhukhanv2.algo.algorepo.recursion;

/**
 * @author Subhrajit Sadhukhan
 */
public class TowerOfHanoi {
    public static void main(String[] args) {
        moveDisk(3, "A", "B", "C");
    }

    public static void moveDisk(int n, String a, String b, String c) {
        //T(n)=2T(n-1)+1
        //Complexity Math.pow(2,n)-1
        if (n == 1) {
            System.out.println("Moving disk " + n + " from " + a + " to " + c);
            return;
        }
        moveDisk(n - 1, a, c, b);
        System.out.println("Moving disk " + n + " from " + a + " to " + c);
        moveDisk(n - 1, b, a, c);

    }
}
