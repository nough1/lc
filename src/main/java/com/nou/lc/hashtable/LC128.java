package com.nou.lc.hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-consecutive-sequence/description/
 * 思路 : 先找到序列的第一个元素 , 然后转换为判断元素是否存在
 */
public class LC128 {

    public int longestConsecutive(int[] nums) {

        Set<Integer> numSet  = new HashSet<>();
        for(int num:nums){
            numSet.add(num);
        }
        int longestSeqLength = 0;
        for(int num:nums){

            if(!numSet.contains(num-1)){
                int sequenceLength = 1 ;
                while (numSet.contains(num+sequenceLength)){
                    sequenceLength++;
                }
                longestSeqLength = Math.max(longestSeqLength,sequenceLength);
            }
        }
        return longestSeqLength;
    }
}
