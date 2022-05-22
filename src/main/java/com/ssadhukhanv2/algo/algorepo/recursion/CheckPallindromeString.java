package com.ssadhukhanv2.algo.algorepo.recursion;

/**
 * @author Subhrajit Sadhukhan
 */
public class CheckPallindromeString {
    public static void main(String[] args) {
        String string = "acabaca";
        System.out.println(checkPallindromeOptmized(string, 0, string.length() - 1));
    }

    public static boolean checkPallindromeOptmized(String str, int start, int end) {
        //T(n)=T(n-2)+O(n)
        //Time Complexity O(n)
        //Space Complexity O(n/2) as there can be max n/2 functions in the call  stack at any given time
        if (start >= end) {
            return true;
        }
        return str.charAt(start) == str.charAt(end) && checkPallindromeOptmized(str, start + 1, end - 1);
    }

    public static boolean checkPallindrome(String str, int start, int end) {

        if (str.length() == 0 || str.length() == 1 || start > end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        start++;
        end--;
        return checkPallindrome(str, start, end);
    }
}
