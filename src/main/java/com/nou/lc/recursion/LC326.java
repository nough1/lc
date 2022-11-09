package com.nou.lc.recursion;

/**
 * https://leetcode.com/problems/power-of-three/
 * 有点乱
 */
public class LC326 {

    public boolean isPowerOfThree(int n) {

        if(n<=0)return false ;

        while(n%3==0)n=n/3;
        return n==1;
    }

}
