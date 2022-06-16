package com.nou.lc.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum/
 * https://www.youtube.com/watch?v=GBKI9VSKdGg
 */
public class LC39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates,0,new ArrayList<>(),result,target,0);
        return result;
    }

    public void backtrack(int[] cand,int i,List<Integer> current,List<List<Integer>> result,int target,int total){


        if(total==target){
            result.add(new ArrayList<>(current));
            return;
        }

        if(total>target || i>=cand.length){
            return;
        }



        current.add(cand[i]);
        backtrack(cand,i,current,result,target,total+cand[i]);
        current.remove(current.size()-1);
        backtrack(cand,i+1,current,result,target,total);
    }
}
