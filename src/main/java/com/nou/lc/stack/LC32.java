package com.nou.lc.stack;

import java.util.Stack;

/**
 * https://leetcode.com/problems/longest-valid-parentheses/
 * https://www.acwing.com/video/1353/
 */
public class LC32 {


    // 用到合法括号的两个性质，左右括号数量相等，任意前缀左括号大于右括号 .
    public int longestValidParentheses(String s) {

        int result = 0;
        Stack<Integer> stack = new Stack<>();
        int segStart = -1;
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='('){
                stack.push(i);
            }else{


                if(stack.isEmpty()){
                    segStart = i;
                }else{

                    stack.pop();
                    if(stack.isEmpty()){
                        result = Math.max(result,i-segStart);
                    }else{
                        result = Math.max(result,i-stack.peek());
                    }
                }

            }
        }
        return result;
    }
}
