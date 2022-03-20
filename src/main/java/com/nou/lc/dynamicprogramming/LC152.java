package com.nou.lc.dynamicprogramming;

/**
 * leetcode 152
 * https://leetcode.com/problems/maximum-product-subarray/
 */
public class LC152 {

    public int maxProduct(int[] nums) {

        int result = getMaxValue(nums);

        int currentMin=1,currentMax=1;

        for(int num:nums){

            int temp = currentMax;
            currentMax = Math.max(currentMax*num,currentMin*num);
            currentMax = Math.max(currentMax,num);
            currentMin = Math.min(temp*num,currentMin*num);
            currentMin = Math.min(currentMin,num);

            result = Math.max(result,currentMax);

        }

        return result;

    }

    public int getMaxValue(int[] nums){

        int maxValue = nums[0];
        for(int num:nums){
            maxValue = Math.max(maxValue,num);
        }
        return maxValue;
    }
}
