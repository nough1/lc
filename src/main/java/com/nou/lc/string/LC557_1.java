package com.nou.lc.string;

public class LC557_1 {

    /**
     * 1. split , reverse , join , 还需要用双指针实现一遍
     * @param s
     * @return
     */
    public String reverseWords(String s) {


        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word:words){


            for(int i=word.length()-1;i>=0;i--){
                sb.append(word.charAt(i));
            }

                sb.append(" ");


        }

        return sb.toString().trim();
    }
}
