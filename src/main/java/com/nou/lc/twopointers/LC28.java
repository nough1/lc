package com.nou.lc.twopointers;

/**
 * https://leetcode.com/problems/implement-strstr/
 */
public class LC28 {

    public int strStr(String haystack, String needle) {


        if(needle==null ||needle.equals("")){
            return 0;
        }
        if(haystack==null||haystack.equals("")){
            return -1;
        }
        for(int i=0;i<haystack.length();i++){


            int j=0;
            int k = i;
            // 这里忘记了定义 k , 但是自己第二次搞定了
            while (k<haystack.length() && j<needle.length() && haystack.charAt(k)==needle.charAt(j)){
                j++;
                k++;
            }

            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }


}
