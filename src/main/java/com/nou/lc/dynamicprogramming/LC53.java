package com.nou.lc.dynamicprogramming;

/**
 * https://leetcode.com/problems/maximum-subarray/
 *
 * https://backtobackswe.com/platform/content/max-contiguous-subarray-sum/solutions
 *
 * 非常好理解的一种做法
 *
 * https://leetcode.com/problems/maximum-subarray/discuss/20193/DP-solution-and-some-thoughts
 *
 *
 */
public class LC53 {

    public int maxSubArray(int[] nums) {


        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for(int i=1;i<nums.length;i++){

            maxEndingHere = Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar = Math.max(maxEndingHere,maxSoFar);
        }
        return maxSoFar;
    }

    /**
     * 这种非常好理解
     * @param nums
     * @return
     */
    public int maxSubArray1(int[] nums) {



        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i=1;i<nums.length;i++){

           dp[i] = nums[i]+dp[i-1]>0?dp[i-1]:0;
            max = Math.max(dp[i],max);
        }
        return max;
    }

}
