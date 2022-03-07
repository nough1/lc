package com.nou.lc.dynamicprogramming;

/**
 * https://leetcode.com/problems/regular-expression-matching/
 * leetcode 10
 * regular expression matching
 * related topic : recursion string , dynamic programming
 */
public class LC10 {


    public boolean isMatch(String s, String p) {

        return isMatch(0,0,s,p);

    }

    public boolean isMatch(int sIndex,int pIndex,String s, String p){

        // 两个都移动到字符串末尾，说明匹配
        if(sIndex>=s.length() && pIndex>=p.length()){
            return true ;
        }

        // pattern 遍历完毕，但是字符串还没，肯定不匹配
        if(pIndex>=p.length()){
            return false;
        }

        boolean match = sIndex<s.length() && ((s.charAt(sIndex)==p.charAt(pIndex))||p.charAt(pIndex)=='.');

        if(pIndex+1<p.length() && p.charAt(pIndex+1)=='*'){

            return isMatch(sIndex,pIndex+2,s,p) || (match && isMatch(sIndex+1,pIndex,s,p));

        }

        // 这个不能在上面那个分之的前面，否则会有问题
        if(match){
            return isMatch(sIndex+1,pIndex+1,s,p);
        }

        return false;

    }
}
