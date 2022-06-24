package com.nou.lc.bit;

/**
 * https://leetcode.com/problems/hamming-distance/discuss/94698/Java-1-Line-Solution-%3AD
 * Brian Kernighan's Alogrithm
 */
public class LC461 {

    public int hammingDistance(int x, int y) {

        return Integer.bitCount(x^y);
    }

    public int hammingDistance1(int x, int y) {
        int num=x^y;
        int count=0;
        while(num!=0){
            count++;
            num=num&(num-1);
        }
        return count;
    }
}
