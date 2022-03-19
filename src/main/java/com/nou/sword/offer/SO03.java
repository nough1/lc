package com.nou.sword.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 *
 */
public class SO03 {

    public int findRepeatNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int num:nums){
            if(set.contains(num)){
                return num;
            }else{
                set.add(num);
            }
        }
        return -1;
    }
}
