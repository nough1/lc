package com.nou.lc;

/**
 * 盛最多水的容器
 */
public class LC11 {

    public int maxArea(int[] height){

        int result = 0;

        //双指针移动,哪一边比较矮，哪一边就移动
        for(int i=0,j=height.length-1;i<j;){

            result = Math.max(result,(j-i)*Math.min(height[i],height[j]));
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }

        }

        return result;

    }
}
