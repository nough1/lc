package com.nou.lc.twopointers;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/discuss/636988/Sliding-Window-or-HashTable-or-Java-Explained-with-Diagram-Beats-99
 * keyword , two pointers , hash table
 */
public class LC438 {

    public List<Integer> findAnagrams(String s, String p) {




        List<Integer> result = new ArrayList<>();

         int[] pcount = new int[26];
        int[] scount = new int[26];

        int plen = p.length();
        int slen = s.length();

        int left = 0,right = 0;
        if(slen<plen){
            return  result;
        }
        // init p count

        while (right<plen){

            pcount[p.charAt(right)-'a']++;
            scount[s.charAt(right)-'a']++;
            right++;

        }

        right -=1;

        while (right<slen){

            if(isSame(pcount,scount)){
                result.add(left);
            }
            right++;
            scount[s.charAt(left)-'a']--;
            left++;
            if(right<slen){
                scount[s.charAt(right)-'a']++;
            }

        }
        return result;
    }

    public boolean isSame(int[] pcount ,int[] scount){

        for(int i=0;i<26;i++){

            if(pcount[i]!=scount[i]){
                return false;
            }
        }
        return true;
    }
}
