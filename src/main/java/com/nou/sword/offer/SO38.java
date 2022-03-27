package com.nou.sword.offer;

import java.util.*;

/**
 * string permutation
 * 想不出怎么写 .
 */
public class SO38 {

    private List<String> permutations = new ArrayList<>();

    public String[] permutation(String s) {

        Map<Character,Integer> charCountMap = new HashMap<>();
        for(char character : s.toCharArray()){

            if(charCountMap.containsKey(character)){
                charCountMap.put(character,charCountMap.get(character)+1);
            }else{
                charCountMap.put(character,1);
            }
        }

        char[] characters = new char[charCountMap.size()];
        int[] charCount = new int[charCountMap.size()];
        int index = 0;
        for(Map.Entry<Character,Integer> entry:charCountMap.entrySet()){

            characters[index] = entry.getKey();

            charCount[index] = entry.getValue();
            index++;
        }
        char[] result = new char[s.length()];
        backtrack(characters,charCount,result,0);
        return permutations.toArray(new String[permutations.size()]);
    }

    public void backtrack(char[] characters,int[] charCounts,char[] result,int level){

        if(level==result.length){
            permutations.add(new String(result));
            return;
        }

        for(int i=0;i<characters.length;i++){

            if(charCounts[i]==0){
                continue;
            }

            // 选择这个字符
            result[level] = characters[i];
            charCounts[i]--;
            // 深度选择
            backtrack(characters,charCounts,result,level+1);

            // 回溯
            charCounts[i]++;

        }

    }


}
