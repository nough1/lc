package com.nou.lc.tree;

import com.nou.lc.base.TreeNode;

/**
 * check whether it is a subtree of another tree
 */
public class LC572 {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root==null && subRoot!=null){
            return false;
        }
        if(root!=null && subRoot==null){
            return true;
        }
        if(root==null && subRoot==null){
            return true;
        }


     /*   if(root.val==subRoot.val){

            // 这里逻辑有问题，子树不等于相同
            return isSameTree(root.left,subRoot.left) && isSameTree(root.right,subRoot.right);

        }else{

            return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
        }
*/
        /**
         * 先看是不是整颗树的子树
         */
        if(isSameTree(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);

    }

    /**
     * 合并判断，更紧凑点
     * @param root
     * @param subRoot
     * @return
     */
    public boolean isSameTree(TreeNode root,TreeNode subRoot){

        if(root==null && subRoot==null) return true;
        if(root==null ||subRoot==null) return false;

        if(root.val!=subRoot.val){
            return false;
        }
        return isSameTree(root.left,subRoot.left) && isSameTree(root.right,subRoot.right);
    }
}
