package com.nou.lc.heap;

import java.util.*;

/**
 * https://leetcode.com/problems/find-k-closest-elements/
 */
public class LC658 {

    public class Pair{
        public int key;
        public int value;
        public Pair(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        Queue<Pair> queue = new PriorityQueue<Pair>(k, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {

                if(o1.key==o2.key){
                    return o2.value-o1.value;
                }else{
                    return o2.key-o1.key;
                }
            }
        });

        List<Integer> result = new ArrayList<>();
        for(int num:arr){
            queue.add(new Pair(Math.abs(x-num),num));
            if(queue.size()>k){
                queue.poll();
            }
        }
        while (!queue.isEmpty()){
            result.add(queue.poll().value);
        }
        Collections.sort(result);
        return result;
    }
}
