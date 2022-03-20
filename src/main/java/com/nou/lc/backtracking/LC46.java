package com.nou.lc.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/permutations/
 * permutation
 */
public class LC46 {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(result,visited,new ArrayList<>(),nums);
        return result;

    }

    void backtrack(List<List<Integer>> result,boolean[] visited,List<Integer> permutation,int[] nums){


        if(permutation.size()==nums.length){

            // 注意这里必须 new 新一个
            result.add(new ArrayList<>(permutation));
            return;
        }

        for(int i=0;i<nums.length;i++){

            if(visited[i])continue;

            permutation.add(nums[i]);
            visited[i] = true ;

            backtrack(result,visited,permutation,nums);

            visited[i] = false;
            permutation.remove(permutation.size()-1);

        }

    }
}
