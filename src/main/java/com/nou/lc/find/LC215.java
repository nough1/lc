package com.nou.lc.find;

/**
 * kth largest 问题 .
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 * 思路 : quick select 算法
 */
public class LC215 {

    int  quick_sort(int[] nums,int l,int r,int k){

        if(l==r){
            return nums[k];
        }
        int x = nums[l];
        int i=l-1;
        int j=r+1;
        while (i<j){

            System.out.println("i:"+i+",j:"+j);
            i++;
            while (nums[i]>x){
                i++;
            }
            j--;
            while (nums[j]<x){
                j--;
            }

            if(i<j){
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i]= temp;
            }



        }

        if(k<=j){
            return quick_sort(nums,l,j,k);
        }else{
            return quick_sort(nums,j+1,r,k);
        }

    }

    public int findKthLargest(int[] nums, int k) {


        return quick_sort(nums,0,nums.length-1,k-1);

    }
}
