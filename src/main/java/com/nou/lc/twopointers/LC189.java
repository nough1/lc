package com.nou.lc.twopointers;

/**
 * https://www.youtube.com/watch?v=lTHTR_jsqAQ
 * https://leetcode-cn.com/problems/rotate-array/
 * 找规律的题目
 */
public class LC189 {

    public void rotate(int[] nums, int k) {

        k%=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

    }

    public void reverse(int[] nums,int start,int end){

        while (start<end){

            int tmp = nums[end];
            nums[end] = nums[start];
            nums[start] = tmp;
            start++;
            end--;

        }

    }
}
