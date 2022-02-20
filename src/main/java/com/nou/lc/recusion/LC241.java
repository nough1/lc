package com.nou.lc.recusion;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/different-ways-to-add-parentheses/
 * different way to add parentheses
 * 思路: 找到所有的操作树，然后递归算下左右两边的可能性，然后进行组合
 */
public class LC241 {

    public List<Integer> diffWaysToCompute(String expression) {

        List<Integer> result = new ArrayList<>();

        for(int i=0;i<expression.length();i++){

            Character character = expression.charAt(i);
            if(character=='+'||character=='-'||character=='*'){

                String leftExpression = expression.substring(0,i);
                List<Integer> leftExpressionWays= diffWaysToCompute(leftExpression);
                String rightExpression = expression.substring(i+1);
                List<Integer> rightExpressionWays= diffWaysToCompute(rightExpression);
                for(int x=0;x<leftExpressionWays.size();x++){

                    for(int y=0;y<rightExpressionWays.size();y++){

                        if(character=='+'){
                            result.add(x+y);
                        }else if(character=='-'){
                            result.add(x-y);
                        }else if(character=='*'){
                            result.add(x*y);
                        }
                    }
                }
            }

        }
        // 如果是数字本身，没有操作符的时候，就是自身 .
        if(result.size()==0){
            result.add(Integer.valueOf(expression));
        }
        return result;
    }
}
