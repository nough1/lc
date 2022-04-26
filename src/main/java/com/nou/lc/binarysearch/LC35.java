package com.nou.lc.binarysearch;

/**
 * https://leetcode-cn.com/problems/search-insert-position/
 * leetcode 35
 * 
 *
 */
public class LC35 {

    public int searchInsert(int[] nums, int target) {

        int low =0 ,high = nums.length-1;
        while (low<=high){

            int mid = low+(high-low)/2;

            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                high = high-1;
            }else{
                low = low+1;
            }
        }
        return low;
    }
}
