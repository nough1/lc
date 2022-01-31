package com.nou.lc.structure;

public class Node {

    public int val;
    public Node next;

    public Node random;

    Node(){}


    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
