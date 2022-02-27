package com.nou.lc;

/**
 * anagram word
 * https://leetcode.com/problems/valid-anagram/
 * 思路: 计算两个单词的字母个数，都相同，则是
 */
public class LC242 {

    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        int[] charCount = new int[26];

        for(int i=0;i<s.length();i++){

            charCount[s.charAt(i)-'a']++;
            charCount[t.charAt(i)-'a']--;

        }
        for(int charNum:charCount){
            if(charNum!=0){
                return false;
            }
        }
        return true;
    }
}
