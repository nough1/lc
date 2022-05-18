package com.nou.lc.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.cn/problems/subsets/
 * https://www.youtube.com/watch?v=REOH22Xwdkk
 */
public class LC78 {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Set<Integer> subset = new HashSet<>();

        dfs(result,0,nums,subset);

        return result;

    }


    /**
     * 为什么参数 subset 用 list 的时候会报 indexofout bound
     * @param result
     * @param index
     * @param nums
     * @param subSet
     */
    public void dfs(List<List<Integer>> result , int index, int[] nums, Set<Integer> subSet){

        if(index>=nums.length){

            List<Integer> subSetCopy = new ArrayList<>(subSet);
            result.add(subSetCopy);
            return;
        }

        // choose the element

        subSet.add(nums[index]);
        dfs(result,index+1,nums,subSet);

        // not choose the element
        subSet.remove(nums[index]);
        dfs(result,index+1,nums,subSet);


    }
}
