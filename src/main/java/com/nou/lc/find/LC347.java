package com.nou.lc.find;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/top-k-frequent-elements/
 * date:2022-02-07 17:25
 * 思路:桶排序 ( bucket sort )
 * 第二遍看这个代码，没有发现关键解决方案罗技
 */
public class LC347 {

    public int[] topKFrequent(int[] nums, int k) {

        int[] result = new int[k];

        Map<Integer,Integer> numCountMap= new HashMap<>();

        for(int num:nums){

            numCountMap.put(num,numCountMap.getOrDefault(num,0)+1);


        }

        // 这里的一些坑还是挺多，主要是不熟悉 , list 根据 index 来查询的需要先初始化下，另外长度需要注意下.
        // 用频率作为一个桶号
        List<List<Integer>> countBucket = new ArrayList<>(nums.length+1);
        for(int i=0;i<nums.length+1;i++){
            countBucket.add(i,new ArrayList<>());
        }
        for(Map.Entry<Integer,Integer> entry:numCountMap.entrySet()){


            List<Integer> values = countBucket.get(entry.getValue());
            values.add(entry.getKey());
        }

        // 这里用 i 跟 k 两个变量控制，需要再想下 .
        int count = 0;
        for(int i=countBucket.size()-1;i>=1 && count<k;i--){

            if(countBucket.get(i)!=null){

                for(Integer element:countBucket.get(i)) {
                    result[count++] = element;
                }
            }

        }

        return result;

    }
}
