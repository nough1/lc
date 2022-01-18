package com.nou.lc.link;

import java.util.*;

/**
 * 第一次提交，漏掉了找到第一个之后，j++,k-- 的操作.导致死循环
 */
public class LC15 {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){

            int j=i+1;
            int k=nums.length-1;
            while(j<k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        result.addAll(set);
        return result;
    }
}
