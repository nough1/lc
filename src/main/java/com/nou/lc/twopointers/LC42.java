package com.nou.lc.twopointers;

/**
 * https://leetcode.com/problems/trapping-rain-water/
 * trapping rain water
 * solution : two pointers
 *
 */
public class LC42 {

    public int trap(int[] height) {

        if(height.length<3){
            return 0;
        }
        // 整体思路 : 计算每一个 bar 可以接的雨水数量 , 每一个 bar
        // 可以接的雨水数量等于 min(左边最大值,右边最大值)-当前值

        int[] maxLeftArray = new int[height.length];
        int maxLeftValue = 0;
        for(int i=0;i<height.length;i++){

            maxLeftArray[i] = maxLeftValue;

            if(height[i]>maxLeftValue){
                maxLeftValue = height[i];
            }
        }

        int[] maxRightArray = new int[height.length];
        int maxRightValue = 0;
        for(int i=height.length-1;i>=0;i--){

            maxRightArray[i] = maxRightValue;

            if(height[i]>maxRightValue){
                maxRightValue = height[i];
            }
        }

        // 计算接的雨水的数量
        int[] trappingWaters = new int[height.length];

        for(int i=1;i<height.length-1;i++){

            if(height[i]<maxLeftArray[i] && height[i] < maxRightArray[i]) {
                trappingWaters[i] = Math.min(maxLeftArray[i], maxRightArray[i]) - height[i];
            }

        }

        int result = 0;

        for(int i=0;i<trappingWaters.length;i++){

            result+=trappingWaters[i];

        }

        return result;
    }

    /**
     * 优化写法 : 将空间复杂度调整为 o(1) , 利用双指针做法
     * @param height
     * @return
     */
    public int trapOpt(int[] height) {

        return 0;
    }
}
