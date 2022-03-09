package com.nou.lc.string;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 *
 * https://www.youtube.com/watch?v=bl8ue-dTxgs
 *
 *
 */
public class LC14 {

    public String longestCommonPrefix(String[] strs) {

        if(strs.length==0){
            return "";
        }

        String prefix = strs[0];

        for(int i=1;i<strs.length;i++){

            while (strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }

        }
        return prefix;
    }
}
