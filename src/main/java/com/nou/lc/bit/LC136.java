package com.nou.lc.bit;

/**
 * https://leetcode.com/problems/single-number/
 *
 */
public class LC136 {

    public int singleNumber(int[] nums) {

        int result =  0;
        for(int num:nums){
            result^= num;
        }
        return result;
    }
}
