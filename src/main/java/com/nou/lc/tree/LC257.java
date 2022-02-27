package com.nou.lc.tree;

import com.nou.lc.base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * binary tree paths
 * https://leetcode.com/problems/binary-tree-paths/
 * 思路: 深度优先遍历 . 递归
 */
public class LC257 {

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> result = new ArrayList<>();

        if(root==null){
            return result;
        }

        String path = Integer.toString(root.val);

        if(root.left==null && root.right==null){
            result.add(path);
            return result;
        }
        if(root.left!=null){
            dfs(root.left,path,result);
        }
        if(root.right!=null){
            dfs(root.right,path,result);
        }
        return result;

    }

    public void dfs(TreeNode node,String path,List<String> result){

        path = path + "->" + node.val;

        if(node.left==null && node.right==null){
            result.add(path);
            return;
        }
        if(node.left!=null){
            dfs(node.left,path,result);
        }
        if(node.right!=null){
            dfs(node.right,path,result);
        }
    }

}
