package com.nou.lc.array;

import com.nou.lc.ListNode;

import java.util.HashMap;
import java.util.Map;

public class LC141 {

    public boolean hasCycle(ListNode head) {


        if(head==null||head.next==null) {
            return false;
        }
        Map<ListNode,Boolean> visited = new HashMap<>();
        ListNode current = head;
        while (current!=null){

            if(visited.containsKey(current)){
                return true;
            }
            visited.put(current,true);
            current = current.next;
        }
        return false ;
    }

    public boolean hasCycleWithMap(ListNode head){

        if(head==null||head.next==null) {
            return false;
        }
        Map<ListNode,Boolean> visited = new HashMap<>();
        ListNode current = head;
        while (current!=null){

            if(visited.containsKey(current)){
                return true;
            }
            visited.put(current,true);
            current = current.next;
        }
        return false ;
    }

    public boolean hasCycleWithTwoPointers(ListNode head){

       ListNode slow = head , fast = head;

       while (fast!=null && fast.next!=null){

           slow = slow.next;
           fast = fast.next.next;

           if(slow==fast){
               return true;
           }

       }
       return false;
    }
}
