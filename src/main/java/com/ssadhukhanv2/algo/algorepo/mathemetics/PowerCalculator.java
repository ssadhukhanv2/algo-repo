package com.ssadhukhanv2.algo.algorepo.mathemetics;

/**
 * @author Subhrajit Sadhukhan
 */
public class PowerCalculator {
    public static void main(String[] args) {
//        System.out.println(power(2, 3));
//        System.out.println(power(9, 9));
//        System.out.println(powerNaive(2, 3));
//        System.out.println(powerNaive(3, 5));

        System.out.println(myPow(2.0, -2147483648));
    }


    public static int powerNaive(int x, int n) {
        int power = 1;
        while (n-- > 0) {
            power *= x;
        }
        return power;
    }

    // T(n) = T([n/2])+O(1)
    // Time complexity is reduced by 2 at each level
    // So Time complexity =  O log2(n)
    // Auxilary Space  O  log(n)

    public static int power(int x, int n) {
        if (n == 0)
            return 1;
        int temp = power(x, n / 2);
        temp = temp * temp;
        if (n % 2 == 0)
            return temp;
        else
            return temp * x;

    }

    public static double myPow(double x, int N) {

        double n = Double.valueOf(N);
        boolean negative = n < 0.0;
        if (negative) {
            n = n * -1;
        }
        double power = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                power = power * x;
            }
            x = x * x;
            n = n / 2;
//            System.out.println(power);
        }
        if(!Double.isInfinite(power)){
            return 0;
        }

        return negative ? 1.0 / power : power;
    }
}
