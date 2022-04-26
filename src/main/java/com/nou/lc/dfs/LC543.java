package com.nou.lc.dfs;

import com.nou.lc.base.TreeNode;

/**
 * https://leetcode-cn.com/problems/diameter-of-binary-tree/
 * diameter of binary tree
 */
public class LC543 {

    public int diameterOfBinaryTree(TreeNode root) {


        if(root==null){
            return 0;
        }
        int leftTreeHeight = maxDepth(root.left);
        int rightTreeHeight = maxDepth(root.right);

        // why not height+1
        return  Math.max(leftTreeHeight+rightTreeHeight,Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)));


    }

    public int maxDepth(TreeNode root) {

        if(root==null){
            return 0;
        }

        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
