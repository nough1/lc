package com.nou.lc.twopointers;

/**
 *  https://leetcode.com/problems/remove-element/
 *  two pointer array
 */
public class LC27 {

    public int removeElement(int[] nums, int val) {

        int i=0;
        for(int j=0;j<nums.length;j++) {

            if(nums[j]!=val){

                int temp = nums[j];
                nums[j] = nums[i];
                nums[i++] = temp;

            }
        }
        return i;
    }
}
