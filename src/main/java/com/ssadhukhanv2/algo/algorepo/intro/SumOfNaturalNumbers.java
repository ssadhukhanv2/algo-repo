package com.ssadhukhanv2.algo.algorepo.intro;

import org.springframework.util.StopWatch;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Subhrajit Sadhukhan
 */
public class SumOfNaturalNumbers {

    public static void main(String[] args) {

        Function<Integer, Integer> sumNaturalNumbers = n -> {
            int sum = 0;
            while (n > 0) {
                sum += n;
                n--;
            }
            return sum;
        };

        Function<Integer, Integer> sumNaturalNumbersUsingArithmeticProgression = n -> {
            return n * (n + 1) / 2;
        };

        int term=100;

        System.out.println("Sum of Natural Numbers");
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        int sum=sumNaturalNumbers.apply(term);
        stopWatch.stop();
        System.out.println("Using Loops. Sum: "+sum+" Time taken: "+stopWatch.getTotalTimeNanos());

        stopWatch=new StopWatch();
        stopWatch.start();
        sum=sumNaturalNumbersUsingArithmeticProgression.apply(term);
        stopWatch.stop();
        System.out.println("Using Mathematical Formulae. Sum: "+sum+" Time taken: "+stopWatch.getTotalTimeNanos());
    }
}
