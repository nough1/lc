package com.nou.lc.hashtable;

import java.util.HashSet;
import java.util.Set;

public class LC268 {

    public int missingNumber(int[] nums) {


        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i=0;i<=nums.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }

    public int missingNumberBitManu(int[] nums) {

        int xor = 0,i=0;

        for(i=0;i<nums.length;i++){

            xor = xor^i^nums[i];
        }
        return xor ^ i;
    }
}
