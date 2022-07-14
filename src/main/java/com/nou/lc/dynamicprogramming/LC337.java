package com.nou.lc.dynamicprogramming;

import com.nou.lc.base.TreeNode;

/**
 * https://www.youtube.com/watch?v=nHR8ytpzz7c
 * 求极值问题 ,dp 问题
 * https://leetcode.com/problems/house-robber-iii/
 * 比较难想到，但是树的一贯特性是分析了一个节点之后，用递归解决
 */
public class LC337 {

    public int rob(TreeNode root) {

        int[] res = dfs(root);
        return Math.max(res[0],res[1]);
    }

    public int[] dfs(TreeNode root){

        if(root==null){
            return new int[2];
        }

        int[] res = new int[2];

        // case1 : with root , and it can not include left and right node
        int[] leftPair = dfs(root.left);
        int[] rightPair = dfs(root.right);
        res[0] = root.val+leftPair[1] + rightPair[1];
        // case2 : without root ,
        res[1] = Math.max(leftPair[0],leftPair[1] )+Math.max(rightPair[0],rightPair[1]);
        return res;

    }
}
