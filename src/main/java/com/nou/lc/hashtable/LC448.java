package com.nou.lc.hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.cn/problems/find-all-numbers-disappeared-in-an-array/
 */
public class LC448 {

    // hashset solution , 通过数据结构 hashtable 想到的方案，刚开始没想出来
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for(int num:nums){
            set.add(num);

        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}
