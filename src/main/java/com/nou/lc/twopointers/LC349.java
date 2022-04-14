package com.nou.lc.twopointers;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays/submissions/
 */
public class LC349 {


    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        List<Integer> result = new ArrayList<>();

        for(int num:set2){

            if(set1.contains(num)){
                result.add(num);
            }
        }
        int[] res = new int[result.size()];
        res = result.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
}
