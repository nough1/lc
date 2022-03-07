package com.nou.lc.binarysearch;

/**
 * https://leetcode.com/problems/binary-search/
 * binary search
 */
public class LC704 {

    public int search(int[] nums, int target) {

        int low=0,high=nums.length-1;

        // 这里相等要注意下
        while (low<=high){

            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid-1 ;
            }

        }
        return -1;
    }
}
