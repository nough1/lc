package com.nou.lc.tree;

import com.nou.lc.base.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * https://www.youtube.com/watch?v=ihj4IQGZ2zc
 * 思路分析比较简单，但是转换成代码不容易
 */
public class LC105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer,Integer> indexMap = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            indexMap.put(inorder[i],i);
        }
        return buildTree(preorder,inorder,0,preorder.length-1,0,inorder.length-1,indexMap);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd, Map<Integer,Integer> indexMap){

        if(preStart>preEnd || inStart>inEnd){
            return null ;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int inRootIndex = indexMap.get(preorder[preStart]);
        int numsLeft = inRootIndex - inStart;
        root.left = buildTree(preorder,inorder,preStart+1,preStart+numsLeft,inStart,inRootIndex-1,indexMap);
        root.right = buildTree(preorder,inorder,preStart+numsLeft+1,preEnd,inRootIndex+1,inEnd,indexMap);
        return root;
    }
}
