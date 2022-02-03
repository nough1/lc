package com.nou.lc.string;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/
 * 思路 : 滑动窗口,哈希表 ( 判断不同的字符数 ) .
 */
public class LC340 {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {

        if(s==null||s.length()==0){
            return  0;
        }

        int left =0,right =0,result=0;
        Map<Character,Integer> window = new HashMap<>();
        while(right<s.length()){

            Character character = s.charAt(right);
           window.put(character,window.getOrDefault(character,0)+1);

           if(window.size()>k){

               Character temp = s.charAt(left);
               if(window.get(temp)==1){
                   window.remove(temp);
               }else{
                   window.put(temp,window.get(temp)-1);
               }
               left++;
           }
           result = Math.max(result,right-left+1);
           right++;
        }
        return result;
    }
}
