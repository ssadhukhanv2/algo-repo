package com.ssadhukhanv2.algo.algorepo.intro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Subhrajit Sadhukhan
 */
public class PrimeProduct {
    public static void main(String[] args) {
        int terms = 10;
        long mod=1000000007;
        List<Long> primeList = new ArrayList<>();

        for (long i = 18468; i <= 18510; i++) {
            if (checkPrime(i)) {
                primeList.add(i);
            }
        }

        System.out.println(primeList);
        Long primeProduct = primeList.stream().reduce(1L, (intermediateProduct, prime) -> (intermediateProduct * prime)%mod);
        //System.out.println(primeProduct);
        System.out.println(primeProduct);
    }

    public static boolean checkPrime(Long n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
