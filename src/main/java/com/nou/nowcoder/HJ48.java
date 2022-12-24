package com.nou.nowcoder;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 链表删除
 */
public class HJ48 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int head = in.nextInt();
        List<Integer> list = new LinkedList<>();
        list.add(head);

        for(int i=1;i<n;i++){

            int insertNodeValue =in.nextInt();
            int preNodeValue = in.nextInt();

            list.add(list.indexOf(preNodeValue)+1,insertNodeValue);

        }

        int deleteNodeVal = in.nextInt();
        list.remove(list.indexOf(deleteNodeVal));



        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
