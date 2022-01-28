package com.nou.lc.link;

import com.nou.lc.ListNode;

public class LinkUtil {

    public void printLinkList(ListNode head){

        ListNode currentNode = head;
        while (currentNode!=null){


            System.out.println(currentNode.val);
            currentNode = currentNode.next;

        }

    }
}
