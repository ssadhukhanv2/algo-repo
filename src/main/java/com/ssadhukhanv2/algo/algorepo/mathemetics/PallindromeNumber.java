package com.ssadhukhanv2.algo.algorepo.mathemetics;

/**
 * @author Subhrajit Sadhukhan
 */
public class PallindromeNumber {
    public static void main(String[] args) {
        System.out.println(checkPallindrome_Od(990987827));
        System.out.println(checkPallindrome_Od(1999669991));
    }

    public static boolean checkPallindrome_Od(int n) {

        //Time Complexity: Θ(d) where d is the number of digit in n


        int rev = 0;
        int temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        return rev == n;
    }
}
