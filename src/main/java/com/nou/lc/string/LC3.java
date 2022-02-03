package com.nou.lc.string;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * longest substring without repeating characters
 */
public class LC3 {

    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int right = 0;
        int max = 0;
        Set<Character> window = new HashSet<>();
        while (right<s.length()){

            if(window.contains(s.charAt(right))){
                window.remove(s.charAt(left));
                left++;
            }else {
                window.add(s.charAt(right));
                right++;
                max = Math.max(max,window.size());
            }
        }
        return max;

    }

}
