package com.ssadhukhanv2.algo.algorepo.arrays;

import java.io.Serializable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Subhrajit Sadhukhan
 */
public class PracticeSetEazy{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] arr1 = new int[]{3, 4, 9, 8, 7, 9, 9};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] arr3 = new int[]{9, 9};
        System.out.println(getSecondLargest(arr1));//-1
        System.out.println(getSecondLargest(arr2));//-1
        System.out.println(getSecondLargest(arr3));//-1


        int[] arr4 = new int[]{1, 2, 2, 3, 3, 3, 3, 3, 4, 5, 6, 7};

        printFrequencyInSortedArray(arr4);


        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> integerFuture = (Future<Integer>) executorService.submit(() -> {
            return PracticeSetEazy.getSecondLargest(arr1);
        });
        while (!integerFuture.isDone()) {
            Thread.sleep(500);
        }
        System.out.println(integerFuture.get());
        executorService.shutdown();

    }

    public static void printFrequencyInSortedArray(int[] arr) {
        int frequency = 1;
        int i = 1;
        int n = arr.length;
        while (i < n) {
            while (i < n && arr[i - 1] == arr[i]) {
                frequency++;
                i++;
            }
            System.out.println(arr[i - 1] + " " + frequency);
            frequency = 1;
            i++;
        }
        if (n == 1 || arr[n - 1] != arr[n - 2]) {
            System.out.println(arr[n - 1] + " " + 1);
        }
    }

    public static int getSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] != largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
