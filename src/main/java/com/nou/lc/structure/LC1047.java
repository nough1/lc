package com.nou.lc.structure;


import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 相同的元素进行消除
 */
public class LC1047 {

    public String removeDuplicates(String s){

        if(s==null||s.length()==0){
            return s;
        }
        Deque<Character> stack = new ArrayDeque();
        for(Character character:s.toCharArray()){


            if(stack.isEmpty() || !stack.peek().equals(character)){
                stack.push(character);
            }else{
                stack.pop();
            }

        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();

    }
}
