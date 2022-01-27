package com.nou.lc.bfs;

import com.nou.lc.base.TreeNode;

import java.util.*;

public class LC103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        int pDirection = 1;
        while(queue.size()>0){

            int nodeNumPerLevel = queue.size();
            List<Integer> nodeListPerLevel = new ArrayList<>();
            for(int i=0;i<nodeNumPerLevel;i++){

                TreeNode node = queue.poll();
                nodeListPerLevel.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            if(pDirection>0){
                result.add(nodeListPerLevel);
            }else{
                Collections.reverse(nodeListPerLevel);
                result.add(nodeListPerLevel);
            }
            pDirection = 0-pDirection;

        }
        return result;

    }
}
