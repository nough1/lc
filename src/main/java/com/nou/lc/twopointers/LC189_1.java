package com.nou.lc.twopointers;

public class LC189_1 {

    public void rotate(int[] nums, int k) {

        k%=nums.length;

        rotate(nums,0,nums.length-1);

        rotate(nums,0,k-1);

        rotate(nums,k,nums.length-1);

    }

    /*
       抽象成三个部分的旋转
     */
    public void rotate(int[] nums,int start,int end){

        while (start<end){

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

        }

    }
}
