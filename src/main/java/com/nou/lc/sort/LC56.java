package com.nou.lc.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * merge overlap intervals
 * https://leetcode.com/problems/merge-intervals/
 *
 */
public class LC56 {

    public int[][] merge(int[][] intervals) {

        // 思路 : 排序，检查是否有重叠

        if(intervals.length<=1){
            return intervals;
        }

        // java arrow function
        // leetcode 这里好像又一个bug ，如果用箭头函数 , 排序会不生效
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0],o2[0]);
            }
        });

        System.out.println(Arrays.deepToString(intervals));

        List<int[]> result = new ArrayList<>();


        int[] currentInterval = intervals[0];

        result.add(currentInterval);

        for(int[] nextInterval:intervals){

            int currentEnd = currentInterval[1];
            int nextBegin = nextInterval[0];
            int nextEnd = nextInterval[1];
            if(nextBegin<=currentEnd){

                currentInterval[1] = Math.max(nextEnd,currentEnd);

            }else{

                System.out.println(Arrays.toString(nextInterval)+Arrays.toString(currentInterval));
                currentInterval = nextInterval;
                result.add(currentInterval);

            }

        }

        // 学到了一种新的 list 转二维数组的方式 .
        return result.toArray(new int[result.size()][]);

    }

}
