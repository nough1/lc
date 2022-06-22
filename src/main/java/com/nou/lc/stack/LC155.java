package com.nou.lc.stack;

public class LC155 {

    private StackNode head ;



    public void push(int val) {

        if(head==null){
            head = new StackNode(val,val,null);
        }else{
            head = new StackNode(val,Math.min(val,head.min),head);
        }

    }


    public void pop() {

        head = head.next;

    }

    public int top() {

        return head.val;

    }

    public int getMin() {

        return head.min;

    }

    private class StackNode {

        public  StackNode(int val,int min,StackNode next){
            this.val = val;
            this.min = min;
            this.next = next;
        }

        private int val;

        private int min;

        private StackNode next ;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public StackNode getNext() {
            return next;
        }

        public void setNext(StackNode next) {
            this.next = next;
        }
    }
}
