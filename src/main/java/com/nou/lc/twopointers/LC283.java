package com.nou.lc.twopointers;

/**
 * https://www.youtube.com/watch?v=39VJV4KVyi8
 * https://leetcode.com/problems/move-zeroes/
 * https://www.youtube.com/watch?v=aayNRwUN3Do
 * thought : two pointers .
 */
public class LC283 {

    public void moveZeroes(int[] nums) {

        for(int i=0,j=0;j<nums.length;j++){

            if(nums[j]!=0){

                int temp = nums[j];
                nums[j] = nums[i];
                nums[i++] = temp;

            }
        }
    }
}
