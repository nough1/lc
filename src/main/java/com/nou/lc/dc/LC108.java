package com.nou.lc.dc;

import com.nou.lc.base.TreeNode;

/**
 * dive and conquer
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * 第一眼看到的时候没有什么思路，看了
 * https://www.youtube.com/watch?v=0K0uCMYq5ng
 * 的分析之后发现好简单
 */
public class LC108 {

    public TreeNode sortedArrayToBST(int[] nums) {

        return buildTree(0,nums.length-1,nums);

    }

    public TreeNode buildTree(int l,int r,int[] nums){

        if(l>r){
            return null;
        }

        int mid = l+(r-l)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(l,mid-1,nums);
        root.right = buildTree(mid+1,r,nums);

        return root;
    }
}
