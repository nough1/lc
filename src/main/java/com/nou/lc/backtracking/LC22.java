package com.nou.lc.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/generate-parentheses/
 * generate parentheses
 * 思路: backtracking
 * ref : https://www.youtube.com/watch?v=qBbZ3tS0McI
 */
public class LC22 {

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        backtrack(result,"",0,0,n);
        return result;
    }

    public void backtrack(List<String> result,String currentString ,int open,int close,int max){

        if(currentString.length()==2*max){
            result.add(currentString);
            return;
        }
        if(open<max)backtrack(result,currentString+"(",open+1,close,max);
        if(close<open)backtrack(result,currentString+")",open,close+1,max);

    }
}
