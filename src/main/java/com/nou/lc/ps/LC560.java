package com.nou.lc.ps;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.youtube.com/watch?v=fFVZt-6sgyo
 * https://leetcode-cn.com/problems/subarray-sum-equals-k/
 */
public class LC560 {

    public int subarraySum(int[] nums, int k) {

        int result = 0;
        int sum = 0 ;

        Map<Integer,Integer> sumMap = new HashMap<>();

        // why
        sumMap.put(0,1);
        for(int num:nums){

            sum+=num;
            if(sumMap.containsKey(sum-k)){
                result+=sumMap.get(sum-k);
            }
            // why
            sumMap.put(sum,sumMap.getOrDefault(sum,0)+1);
        }
        return result;
    }
}
