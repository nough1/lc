package com.nou.lc.string;

/**
 * string to integer
 * https://leetcode.com/problems/string-to-integer-atoi/
 * leetcode 8
 * 思路 : 字符串转整数，复杂情况处理
 */
public class LC8 {

    public int myAtoi(String s) {

        if(s==null||s.length()==0){
            return 0;
        }

        // trim 处理
        s = s.trim();

        // 这个地方容易忘记，因为 trim 之后
        if(s==null||s.length()==0){
            return 0;
        }

        int startIndex = 0;


        boolean isNegative = false;
        if(s.charAt(0)=='+'||s.charAt(0)=='-'){
            startIndex = startIndex+1;
        }
        if(s.charAt(0)=='-'){
            isNegative = true ;
        }
        double result = 0;
        s = s.substring(startIndex);
        for(char character:s.toCharArray()){

            if(character<'0' || character>'9'){
                break;
            }
            int digit = character-'0';
            result = result*10+digit;
        }

        if(isNegative){
            result = -result;
        }

        if(result>Integer.MAX_VALUE){
            result = Integer.MAX_VALUE;
        }
        if(result<Integer.MIN_VALUE){
            result = Integer.MIN_VALUE;
        }
        return (int)result;
    }
}
