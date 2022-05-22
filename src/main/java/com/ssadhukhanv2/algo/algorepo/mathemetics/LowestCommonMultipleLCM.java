package com.ssadhukhanv2.algo.algorepo.mathemetics;

/**
 * @author Subhrajit Sadhukhan
 */
public class LowestCommonMultipleLCM {
    public static void main(String[] args) {
        int a = 21;
        int b = 7;
        System.out.println(getLcm(a, b));
        System.out.println(getLCM_euclidean(a, b));
    }

    public static int getLcm(int a, int b) {
        int lcm = Math.max(a, b);
        while (true) {
            if (lcm % a == 0 && lcm % b == 0)
                return lcm;
            lcm++;
        }
    }

    public static int getLCM_euclidean(int a, int b) {
        //Based on formulae
        // a*b=lcm(a,b)*gcd(a,b)
        // lcm(a,b)=a*b/gcd(a,b)

        return a * b / getHCF_euclidean(a, b);
    }


    public static int getHCF_euclidean(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getHCF_euclidean(b, a % b);
    }

}
