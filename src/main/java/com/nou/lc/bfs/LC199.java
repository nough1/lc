package com.nou.lc.bfs;


import com.nou.lc.base.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LC199 {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        if(root==null)
            return result;
        Queue<TreeNode> queue = new ArrayDeque();
        queue.add(root);

        TreeNode rightSideNode = null ;
        while(queue.size()>0){


            int nodeNum = queue.size();
            for(int i=0;i<nodeNum;i++){

                rightSideNode = queue.poll();
                if(rightSideNode.left!=null){
                    queue.add(rightSideNode.left);
                }
                if(rightSideNode.right!=null){
                    queue.add(rightSideNode.right);
                }

            }
            result.add(rightSideNode.val);
        }

        return result;
    }
}
