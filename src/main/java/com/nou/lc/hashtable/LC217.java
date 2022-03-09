package com.nou.lc.hashtable;

import java.util.HashSet;
import java.util.Set;

public class LC217 {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> elements = new HashSet<>();

        for(int num:nums){

            if(elements.contains(num)){
                return true;
            }else{
                elements.add(num);
            }
        }
        return false;
    }
}
