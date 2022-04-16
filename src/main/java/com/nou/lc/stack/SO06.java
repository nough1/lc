package com.nou.lc.stack;

import com.nou.lc.ListNode;

import java.util.Stack;

/**
 * two solution :
 * 1. stack auxiliary
 * 2. recursive
 * https://chowdera.com/2022/03/202203140038000090.html
 */
public class SO06 {

    public int[] reversePrint(ListNode head) {

        Stack<Integer> stack = new Stack<>();

        ListNode current = head;
        while (current!=null){

            stack.push(current.val);
            current = current.next;

        }

        int[] result = new int[stack.size()];
        int size = stack.size();

        // 注意，循环这里不能用 stack.size ( 因为这个值在 pop 的时候经常变 )
        for(int i=0;i<size;i++){
            result[i] = stack.pop();
        }
        return result;
    }

}
