package com.nou.lc.digits;

/**
 * https://leetcode.com/problems/product-of-array-except-self/
 * product of array except self
 * 思路 : prefix sum .
 * 左边前缀算下，右边前缀算下
 */
public class LC238 {

    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        // 计算前缀乘积
        result[0]=1;
        for(int i=1;i<nums.length;i++){
            result[i] = result[i-1]*nums[i-1];
        }

        // 计算后缀乘积
        int suffixTimes = 1;
        for(int i=nums.length-1;i>=0;i--){

            result[i]=result[i]*suffixTimes;
            suffixTimes = suffixTimes*nums[i];
        }

        return result;

    }

}
