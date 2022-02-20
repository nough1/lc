package com.nou.lc.queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 求滑动窗口的最大值.
 * leetcode 239 : https://chuangleetcode-cn.com/problems/sliding-window-maximum/
 * 思路 : 单调队列
 */
public class LC239 {

    public int[] maxSlidingWindow(int[] nums, int k) {

        if(nums.length==0||k==0){
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n-k+1];

        Deque<Integer> windows = new ArrayDeque<>();
        for(int i=0;i<n;i++){

            // 这个是做什么,确保窗口大小为 k , 以 i 结尾的滑动窗口的起点是 i-k+1
            // 记住 first 与 last 的图形上的先后关系 ,左边是 first , 右边是 last

            while (windows.size()>0 && windows.peekFirst()<=i-k){
                windows.pollFirst();
            }

            // 将前面比较小的排除掉 .
            while (windows.size()>0 && nums[windows.peekLast()]<nums[i]){
                windows.pollLast();
            }

            windows.offerLast(i);
            if(i>=k-1){
                result[i-k+1]= nums[windows.peekFirst()];
            }
        }
        return result;
    }

}
