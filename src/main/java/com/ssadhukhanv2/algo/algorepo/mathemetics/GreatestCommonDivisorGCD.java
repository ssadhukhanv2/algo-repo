package com.ssadhukhanv2.algo.algorepo.mathemetics;

/**
 * @author Subhrajit Sadhukhan
 */
public class GreatestCommonDivisorGCD {
    public static void main(String[] args) {
        System.out.println(gcdEuclideanAlgo(9, 10));
        System.out.println(gcdEuclideanAlgo(7, 21));
        System.out.println(gcdEuclideanAlgo(15, 21));

        System.out.println(gcdAdvancedEuclideanAlgoRecursion(7,24));
    }

    public static int gcd(int a, int b) {
        int min = Math.min(a, b);
        while (min > 0) {
            if (a % min == 0 && b % min == 0) {
                return min;
            }
            min--;
        }
        return 1;
    }

    public static int gcdEuclideanAlgo(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int gcdAdvancedEuclideanAlgoRecursion(int a, int b) {
        System.out.println(a+" "+b);
        if(b==0){
            return a;
        }
        return gcdAdvancedEuclideanAlgoRecursion(b,a%b);

    }
}
