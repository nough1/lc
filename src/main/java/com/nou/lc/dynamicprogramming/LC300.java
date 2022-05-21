package com.nou.lc.dynamicprogramming;

import java.util.Arrays;

/***
 * https://leetcode.com/problems/longest-increasing-subsequence/
 * https://www.youtube.com/watch?v=cjWnW0hdF1Y
 */
public class LC300 {

    public int lengthOfLIS(int[] nums) {

        int[] result = new int[nums.length];
        Arrays.fill(result,1);

        for(int i=nums.length-1;i>=0;i--){

            for(int j=i+1;j<nums.length;j++){

                if(nums[j]>nums[i]){

                    result[i] = Math.max(result[i],1+result[j]);

                }

            }

        }

        // new knowledge
        return  Arrays.stream(result).max().getAsInt();

    }
}
