package com.ssadhukhanv2.algo.algorepo;

/**
 * @author Subhrajit Sadhukhan
 */
public class Solution {

    public int search(int[] arr, int target) {
        int start=0;
        int end=arr.length;
        while(start<end){
            int mid=start-(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end=mid;
            }else if(arr[mid]<target){
                start=mid;
            }
        }
        return -1;

    }
}
