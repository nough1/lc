package com.nou.lc;

import java.util.HashMap;
import java.util.Map;

/**
 * 考察双指针以及滑动窗口
 */
public class LC3 {

    public int lengthOfLongestSubstring(String s){

        int result = 0;
        Map<Character,Integer> charCount = new HashMap<>();
        for(int i=0,j=0;i<s.length();i++){
            if(charCount.get(s.charAt(i))==null){
                charCount.put(s.charAt(i),1);
            }else {
                charCount.put(s.charAt(i),charCount.get(s.charAt(i)).intValue()+1);
            }
            while (charCount.get(s.charAt(i))>1){
                charCount.put(s.charAt(j),charCount.get(s.charAt(j)).intValue()-1);
                j++;
            }
            result = Math.max(result,i-j+1);
        }
        return result;
    }

}
