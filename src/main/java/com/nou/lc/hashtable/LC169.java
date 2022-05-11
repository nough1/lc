package com.nou.lc.hashtable;

import java.util.Calendar;

/**
 * https://leetcode-cn.com/problems/majority-element/
 * boyer https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm#Description)
 * boyer moore algorithm
 */
public class LC169 {

    public int majorityElement(int[] nums) {

        int count = 0;
        int res = 0;
        for(int num:nums){

            if(count==0){
                res = num;
            }
            if(res==num){
                count++;
            }else{
                count--;
            }
        }
        return res ;
    }

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR,55);
        System.out.println(calendar.getTime());
    }
}
