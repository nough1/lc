package com.nou.sword.offer;

/**
 * https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 */
public class SO10 {

    public int fib(int n) {

        if(n<2){
            return n;
        }

        int[] result = new int[n+1];
        result[0]=0;
        result[1]=1;

        for(int i=2;i<=n;i++){

            result[i] = result[i-1]+result[i-2];
        }
        return result[n];
    }
}
