package com.nou.lc.twopointers;

/**
 * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/submissions/
 * 踩了三个坑做出来
 * 思路 : split , reverse , 但是忽略了原来的空格字符 , 而且不能每次都追加空格，在尾部的时候要关注
 */
public class LC557 {

    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();
        String[] subs = s.split(" ");
        for(String sub:subs){

            if(!sb.toString().equals("")){
                sb.append(" ");
            }
            StringBuilder reverse = new StringBuilder();
            for(int i=sub.length()-1;i>=0;i--){
                reverse.append(sub.charAt(i));
            }
            sb.append(reverse);

        }

        return sb.toString();
    }
}
