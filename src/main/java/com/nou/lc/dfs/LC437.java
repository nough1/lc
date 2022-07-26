package com.nou.lc.dfs;

import com.nou.lc.base.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/path-sum-iii/
 *
 * 递归的解法 : https://www.youtube.com/watch?v=Vam9gldRapY
 * 前缀和的解法 ： https://www.acwing.com/video/1837/
 */
public class LC437 {
    Map<Integer,Integer> prefixSumMap = new HashMap<>();

    public int pathSum(TreeNode root, int targetSum) {

        prefixSumMap.put(0,1);
        return dfs(root,targetSum,0);



    }

    public int dfs(TreeNode root ,int targetSum,int curr){

        if(root==null){
            return 0 ;
        }

        int result = 0;
        curr+= root.val;

        result+=prefixSumMap.getOrDefault(curr-targetSum,0);


        prefixSumMap.put(curr,prefixSumMap.getOrDefault(curr,0)+1);

        result+=dfs(root.left,targetSum,curr);
        result+=dfs(root.right,targetSum,curr);

        prefixSumMap.put(curr,prefixSumMap.getOrDefault(curr,0)-1);
        return result ;
    }
}
