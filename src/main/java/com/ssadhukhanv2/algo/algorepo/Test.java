package com.ssadhukhanv2.algo.algorepo;

import org.springframework.util.StopWatch;

import java.util.Arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class Test {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(countPrimes(5000000));
        stopWatch.stop();
        System.out.println(stopWatch.getLastTaskTimeMillis());
    }

    public static int countPrimes(int n) {
        return (int) seiveOfEratosthenes(n);
    }

    // 2 3 5 7 11
    public static long seiveOfEratosthenes(int n) {
        if (n == 1 || n == 0) {
            return 0;
        }
        Boolean[] arr = new Boolean[n];
        Arrays.fill(arr, true);
        //int prime = n - 1;
        for (int i = 2; i * i < n; i++) {
            if (arr[i]) {
                for (int j = i * i; j < n; j += i) {
                    if (j % i == 0 && arr[j]) {
                        //System.out.println(j);
                        arr[j] = false;
                        //prime--;
                    }
                }
            }
        }
        int prime = 0;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]) {
                prime++;
            }
        }
        //return Arrays.asList(arr).stream().filter(element -> element).count() - 2;//264
        return prime;

    }
}
