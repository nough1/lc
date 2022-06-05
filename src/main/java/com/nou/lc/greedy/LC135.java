package com.nou.lc.greedy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/candy/
 * https://www.youtube.com/watch?v=Ya-LfQ0OBkU
 */
public class LC135 {

    public int candy(int[] ratings) {
        int result = 0;
        int n = ratings.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        for(int i=1;i<n;i++){

            if(ratings[i]>ratings[i-1]){
                left[i] = left[i-1]+1;
            }
        }

        for(int i=n-2;i>=0;i--){

            // 这里思维需要注意 , 是从 i 开始算 还是 i-1
            if(ratings[i]>ratings[i+1]){
                right[i] = right[i+1]+1;
            }
        }

        for(int i=0;i<n;i++){

            result += Math.max(left[i],right[i]);
        }
        return result;
    }
}
