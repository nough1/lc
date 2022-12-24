package com.nou.lc.structure;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC20_1 {

    public boolean isValid(String s) {

        int length = s.length();
        if(length%2!=0){
            return false;
        }

        Stack<Character> stack = new Stack<>();
        Map<Character,Character> charMap = new HashMap<>();
        charMap.put('}','{');
        charMap.put(']','[');
        charMap.put(')','(');
        for(Character character:s.toCharArray()){

         if(character=='{' ||character=='[' || character=='('){
             stack.push(character);
         }else{

             if(stack.size()==0){
                 return false;
             }
             char top = stack.pop();
             // 判断 top 上的元素是否和当前元素匹配 .
             if(charMap.get(character)!=top){
                 return false;
             }
         }

        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }

    // 比较精简的版本 , 这个版本对上面的代码进行合并精简处理 .
    public boolean isValidPro(String s) {

        Stack<Character> stack = new Stack<>();
        for(Character character:s.toCharArray()){

            if(character=='{'){
                stack.push('}');
            }else if(character=='['){
                stack.push(']');
            }else if(character=='('){
                stack.push(')');
            }else if(stack.isEmpty()||stack.pop()!=character){
                return false;
            }

        }

        return stack.isEmpty();

    }
}
