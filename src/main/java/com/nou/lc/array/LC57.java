package com.nou.lc.array;

import java.util.LinkedList;
import java.util.List;

/**
 * merge the interval
 * https://leetcode.com/problems/insert-interval/description/
 */
public class LC57 {

    public int[][] insert(int[][] intervals, int[] newInterval) {

       List<int[]> result = new LinkedList<>();

       // add all the interval before newInterval

        int i=0;
        int newStart = newInterval[0];
        int newEnd = newInterval[1];
        while (i<intervals.length && intervals[i][1]<newStart){
            result.add(intervals[i++]);
        }

        // merge the overlap

        while (i<intervals.length && intervals[i][0]<=newEnd){


            newStart = Math.min(intervals[i][0],newStart);
            newEnd = Math.max(intervals[i][1],newEnd);
            i++;

        }
        result.add(new int[]{newStart,newEnd});
        // and the remain part

        while (i<intervals.length && intervals[i][0]>newEnd){

            result.add(intervals[i++]);

        }


        return result.toArray(new int[result.size()][]);
    }
}
