package com.nou.lc.twopointers;

/**
 * https://leetcode.com/problems/sort-colors/
 * quick sort 的分区算法
 */
public class LC75 {

    public void sortColors(int[] nums) {


        // 有点难以理解
        int l = 0,r=nums.length-1;
        int current = 0 ;

        while (current<=r){


            if(nums[current]==0){

                nums[current] = nums[l];
                nums[l] = 0;
                l++;
                current++;

            }else if(nums[current]==2){

                nums[current] = nums[r];
                nums[r] = 2;
                r--;

            }else{
                current++;
            }

        }

    }
}
