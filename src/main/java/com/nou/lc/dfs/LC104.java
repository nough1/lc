package com.nou.lc.dfs;

import com.nou.lc.base.TreeNode;

/**
 * https://www.youtube.com/watch?v=hTM3phVI6YQ
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * the maximum the binary tree .
 */
public class LC104 {

    public int maxDepth(TreeNode root) {

        if(root==null){
            return 0;
        }

        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
