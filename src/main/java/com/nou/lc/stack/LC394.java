package com.nou.lc.stack;

import java.util.Stack;

/**
 * https://leetcode.com/problems/decode-string/
 * 思路方向猜对了 , 用 stack
 */
public class LC394 {

    public String decodeString(String s) {


        Stack<Character> stack = new Stack<>();

        int index = 0;

        while (index<s.length()){


            Character c = s.charAt(index);

            if(c==']'){

                StringBuilder innerBracketString = new StringBuilder();
                Character peek = stack.pop();
                while (peek!='['){
                    innerBracketString.insert(0,peek);
                    peek = stack.pop();
                }
                StringBuilder digits = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek()) ){

                    digits.insert(0,stack.pop());

                }
                int repeatNum = Integer.valueOf(digits.toString());
                System.out.println("repeatNum:"+repeatNum);

                StringBuilder repeatedStr = new StringBuilder();
                for(int i=0;i<repeatNum;i++){
                    repeatedStr.append(innerBracketString.toString());

                }

                for(int i=0;i<repeatedStr.toString().length();i++){
                    stack.push(repeatedStr.charAt(i));
                }

            }else{
                stack.push(c);
            }
            index++;

        }

        StringBuilder result = new StringBuilder();
        for(Character c:stack){
            result.append(c);
        }
        return result.toString();
    }
}
