package com.nou.lc.math;

/**
 * https://leetcode.com/problems/plus-one/
 * easy 的题目，但是没有那么简单，discusss 的这个防范不错
 *
 */
public class LC66 {

    public int[] plusOne(int[] digits) {

        int n = digits.length;
        for(int i=n-1;i>=0;i--){


            if(digits[i]<9){

                digits[i]++;
                return digits;

            }

            digits[i] = 0;

        }

        int[] result = new int[n+1];
        result[0] = 1;
        return result;
    }

}
