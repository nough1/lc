package com.nou.lc.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://leetcode-cn.com/problems/smallest-k-lcci/
 * solution : https://github.com/eirture/leetcode/blob/master/algorithms/1000021-smallest-k-lcci.md
 * https://python.iitter.com/other/31614.html
 * 参考 leetcode 215
 */
public class Interview17 {


    // 大顶堆思路
    public int[] smallestK(int[] arr, int k) {

        if(k==0){
            return new int[]{};
        }
        PriorityQueue<Integer> bigRootHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for(int num:arr){

            if(bigRootHeap.size()<k){
                bigRootHeap.add(num);
            }else{

                if(num<bigRootHeap.peek()){

                    bigRootHeap.poll();
                    bigRootHeap.add(num);

                }
            }

        }
        int[] result = new int[bigRootHeap.size()];
        for(int i=0;i<k;i++){
            result[i] = bigRootHeap.poll();
        }
        return result;
    }


    public int[] smallestKQuickSort(int[] arr, int k) {

        return new int[]{};
    }
}
