package com.nou.lc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 2021.12.23 开始
 */
public class LC1 {

    public static void main(String[] args) {

        int[] nums = new int[]{3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] nums, int target){

        Map<Integer,Integer> valueIndexMap= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            valueIndexMap.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){

            int other = target-nums[i];
            System.out.println(other);
            if(valueIndexMap.get(other)!=null && valueIndexMap.get(other)!=i){

                System.out.println(other);
                return new int[]{i,valueIndexMap.get(other)};
            }

        }

        return null;
    }

}
