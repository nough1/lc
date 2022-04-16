package com.nou.lc.twopointers;

/**
 * https://www.youtube.com/watch?v=39VJV4KVyi8
 * https://leetcode.com/problems/move-zeroes/
 * https://www.youtube.com/watch?v=aayNRwUN3Do
 * thought : two pointers .
 */
public class LC283 {

    public void moveZeroes(int[] nums) {

        for(int i=0,j=0;j<nums.length;j++){

            if(nums[j]!=0){

                int temp = nums[j];
                nums[j] = nums[i];
                nums[i++] = temp;

            }
        }
    }

    // 这种解法比较好理解
    public void moveZeroes1(int[] nums) {

       int left = 0 ;
       for(int num:nums){

           if(num!=0){
               nums[left++] = num;
           }

       }

       while (left<nums.length)nums[left++]=0;

    }

}
