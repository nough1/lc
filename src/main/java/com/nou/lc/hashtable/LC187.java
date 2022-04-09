package com.nou.lc.hashtable;

import java.util.*;

/**
 * https://leetcode.com/problems/repeated-dna-sequences/
 */
public class LC187 {

    public List<String> findRepeatedDnaSequences(String s) {

        List<String> repeatedDnaSequencesList = new ArrayList<>();

        Map<String,Integer> seen = new HashMap<>();

        int i=0;
        while (i+10<=s.length()){

            String subSequence = s.substring(i,i+++10);
            seen.put(subSequence,seen.getOrDefault(subSequence,0)+1);
            if(seen.get(subSequence)==2){
                repeatedDnaSequencesList.add(subSequence);
            }
        }
        return repeatedDnaSequencesList;
    }
}
