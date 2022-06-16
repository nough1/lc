package com.nou.lc.hashtable;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/group-anagrams/
 * ref : discuss .
 *
 */
public class LC49 {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> keyAnaMap = new HashMap<>();
        for(String str:strs){

            // can not convert to int[]
            char[] temp =new char[26];
            for(char c:str.toCharArray()){
                temp[c-'a']++;
            }
            String key = String.valueOf(temp);
            if(keyAnaMap.containsKey(key)){
                keyAnaMap.get(key).add(str);
            }else {
                List<String> list = new ArrayList<>();
                list.add(str);
                keyAnaMap.put(key,list);
            }
        }
        System.out.println(keyAnaMap);
        return new ArrayList<>(keyAnaMap.values());
    }
}
