package com.nou.lc.structure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * 有效的括号
 */
public class LC20 {

    public boolean isValid(String s){

        if(s==null||s.length()==0){
            return true;
        }

        Deque stack = new ArrayDeque();
        Map<Character,Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        for(Character character:s.toCharArray()){

            if(character=='{' ||character=='['||
            character=='('){
                stack.push(character);
            }else if(!stack.isEmpty() && stack.peek()==map.get(character)){
                stack.pop();
            }else{
                return false;
            }

        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        System.out.printf("%d",1234^5678);
    }

}
