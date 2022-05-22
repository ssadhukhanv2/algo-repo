package com.ssadhukhanv2.algo.algorepo.recursion;

import java.util.ArrayList;

/**
 * @author Subhrajit Sadhukhan
 */
public class PrintAllPossibleSubsetsOfString {


    public static void main(String[] args) {
        printSubstring("abc", "", 0);

        System.out.println(powerSet("abc"));
    }

    private static void printSubstring(String str, String currentStr, int i) {
        //Time Complexity Math.pow(2,n) where n is the size of the str
        if (str.length() == i) {
            System.out.println(currentStr);
            return;
        }
        printSubstring(str, currentStr, i + 1);
        printSubstring(str, currentStr + str.charAt(i), i + 1);
    }


    static ArrayList<String> list = new ArrayList<String>();

    //Function to return the lexicographically sorted power-set of the string.
    static ArrayList<String> powerSet(String actualStr) {
        // add your code here
        populateSubset(actualStr, "", 0);
        return list;

    }

    static void populateSubset(String actualStr, String s, int i) {
        if (i == actualStr.length()) {
            //if(!s.equals("")){
            list.add(s);
            //}
            return;
        }
        populateSubset(actualStr, s, i + 1);
        populateSubset(actualStr, s + actualStr.charAt(i), i + 1);

    }

}
