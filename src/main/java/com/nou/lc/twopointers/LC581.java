package com.nou.lc.twopointers;

/**
 * https://www.acwing.com/video/2030/
 * 这个视频讲解不错，把两种解法都讲了，而且有最优解
 * 这个题目的思路很奇妙
 * https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
 */
public class LC581 {

    public int findUnsortedSubarray(int[] nums) {

        int l = 0;
        int r = nums.length-1;

        // first step : find the left point meet the increase order .

        while (l+1<nums.length && nums[l+1]>=nums[l])l++;

        if(l==r)return 0;

        System.out.println("l:"+l+",r:"+r);

        // second step : find the right point meet the increase order .

        while (r-1>=0 && nums[r]>=nums[r-1])r--;
        System.out.println("l:"+l+",r:"+r);

        // third step : find the left point from the left part by judge the left is less than the right part
        // 第三步比较难理解
        for(int i=l+1;i<nums.length;i++){

            while (l>=0 && nums[l]>nums[i]){
                l--;
            }

        }


        for(int i=r-1;i>=0;i--){

            while (r<nums.length && nums[r]<nums[i]){

                r++;

            }

        }
        System.out.println("l:"+l+",r:"+r);
        return r-l-1;
    }
}
