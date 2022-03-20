package com.nou.lc.dynamicprogramming;

/**
 * https://leetcode.com/problems/maximum-subarray/
 *
 * https://backtobackswe.com/platform/content/max-contiguous-subarray-sum/solutions
 *
 *
 */
public class LC53 {

    public int maxSubArray(int[] nums) {


        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for(int i=1;i<nums.length;i++){

            maxEndingHere = Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar = Math.max(maxEndingHere,maxSoFar);
        }
        return maxSoFar;
    }
}
