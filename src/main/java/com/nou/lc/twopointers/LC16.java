package com.nou.lc.twopointers;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/3sum-closest/
 * leetcode 16
 */
public class LC16 {

    public int threeSumClosest(int[] nums, int target) {

        int result = nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){

            int aPointer = i+1;
            int bPointer = nums.length-1;
            while (aPointer<bPointer){

                int sum= nums[i]+nums[aPointer]+nums[bPointer];
                if(sum>target){
                    bPointer--;
                }else{
                    aPointer++;
                }

                if(Math.abs(sum-target)<Math.abs(result-target)){
                    result = sum;
                }

            }
        }
        return result;
    }
}
