package com.nou.lc.dfs;

import com.nou.lc.base.TreeNode;

/**
 * https://leetcode.com/problems/binary-tree-maximum-path-sum/
 */
public class LC124 {

    private Integer result = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {

        postOrder(root);
        return result;

    }

    public int postOrder(TreeNode root){

        if(root==null){
            return 0;
        }

        int left = postOrder(root.left);
        int right = postOrder(root.right);

        left = Math.max(0,left);
        right = Math.max(0,right);
        result = Math.max(result,left+right+root.val);

        return Math.max(left+root.val,right+root.val);
    }
}
