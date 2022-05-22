package com.ssadhukhanv2.algo.algorepo.mathemetics;

/**
 * @author Subhrajit Sadhukhan
 */
public class Factorial {
    public static void main(String[] args) {

        System.out.println(fact_aux_space_Θ1(5));
        System.out.println(fact_aux_space_Θn(5));
    }

    private static int fact_aux_space_Θn(int n) {
        //Time Complexity:  Θ(n)
        //Auxiliary Space:  Θ(n)
        if (n == 1)
            return n;
        return n * fact_aux_space_Θn(n - 1);
    }

    private static int fact_aux_space_Θ1(int n) {
        //Time Complexity:  Θ(n)
        //Auxiliary Space:  Θ(1)
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
