package com.nou.lc.bit;

/**
 * 思路参考下 leetcode discussion ,
 */
public class LC18 {

    public int getSum(int a, int b) {

        int c = 0;
        while(b!=0){

            c = a & b;
            a = a^b;
            b = (c<<1);


        }
        return a;
    }
}
