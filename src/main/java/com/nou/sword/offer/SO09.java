package com.nou.sword.offer;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 * two stack queue .
 */
public class SO09 {

    private Stack<Integer> pushStack ;
    private Stack<Integer> popStack ;

    public SO09() {

        pushStack = new Stack<>();
        popStack = new Stack<>();

    }

    public void appendTail(int value) {

        pushStack.add(value);

    }

    public int deleteHead() {

        if(!popStack.isEmpty()){
            return popStack.pop();
        }

        while (!pushStack.isEmpty()){
            popStack.add(pushStack.pop());
        }

        if(popStack.isEmpty()){
            return -1;
        }
        return popStack.pop();
    }

}
