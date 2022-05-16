package com.nou.lc.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/problems/largest-number/
 * solution :
 */
public class LC179 {

    public String largestNumber(int[] nums) {

        // 1. edge case
        if(nums==null ||nums.length==0){
            return "";
        }
        // 2. convert to string array
        String[] strNums = new String[nums.length];

        for(int i=0;i<nums.length;i++){

            // error 1 : nums[i] mistaken nums
            strNums[i] = String.valueOf(nums[i]);

        }

        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                String s1 = o1+o2;
                String s2 = o2+o1;

                return s2.compareTo(s1);
            }
        });

        // error 2 : not use charAt
        if(strNums[0].charAt(0)=='0'){
            return "0";
        }
        StringBuilder sb = new StringBuilder();

        for(String str:strNums){

            sb.append(str);

        }
        return sb.toString();
    }
}
