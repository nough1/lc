package com.nou.lc.math;

import java.util.Arrays;

/**
 * 找出所有的质数
 * find all the prime num less than the given num
 */
public class LC204 {

    public int countPrimes(int n) {
    
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);
        int count = 0;
        for(int i=2;i<n;i++){

            if(isPrime[i]){
                count++;
                if(i*i<n){

                    for(int j=i*i;j<n;j+=i){
                        isPrime[j] = false;
                    }

                }
            }

        }
        return count;
    }
}
