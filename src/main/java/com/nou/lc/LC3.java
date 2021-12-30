package com.nou.lc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 考察双指针以及滑动窗口,问题
 * 最长不重复子串，利用滑动窗口来解.
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

    // 边界点：什么时候更新 maxLength ,break 后，忘记考虑正常循环结束的情况.
    public int lengthOfLongestSubstringBaoli(String s){

        if(s==null ||s.length()==0){
            return 0;
        }
        char[] sArr = s.toCharArray();
        int maxLength = 0;
        int size = s.length();
        for(int i=0;i<size;i++){

            Set<Character> word = new HashSet<>();
            word.add(sArr[i]);
            int j;
            for(j=i+1;j<size;j++){

                if(word.contains(sArr[j])){
                    break;
                }else{
                    word.add(sArr[j]);
                }

            }
            if(j-i>maxLength){
                maxLength = j-i;
            }


        }
        return maxLength;

    }

    public static void main(String[] args) {
        LC3 lc3 = new LC3();

        System.out.println(lc3.lengthOfLongestSubstringBaoli(" "));
    }
}
