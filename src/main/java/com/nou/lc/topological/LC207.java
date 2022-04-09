package com.nou.lc.topological;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * https://leetcode.com/problems/course-schedule/
 */
public class LC207 {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // first step , choose no incomeDegree vertex

        int[] incomeDegree = new int[numCourses];

        // 这个地方需要思考下，不像二维数组的写法，卡壳了下
        for(int[] prerequisite:prerequisites){

            incomeDegree[prerequisite[0]]++;

        }

        // 获取 income degree zero
        Set<Integer> zeroDegree = new HashSet<>();
        for(int i=0;i<incomeDegree.length;i++){

            if(incomeDegree[i]==0){
                zeroDegree.add(i);
            }
        }

        if(zeroDegree.size()==0){
            return false;
        }

        while (!zeroDegree.isEmpty()){

            // 遍历所有入度为0 的
            Iterator<Integer> iterator = zeroDegree.iterator();
            int course = iterator.next();
            zeroDegree.remove(course);

            // 去掉对应的边
            for(int[] prerequisite:prerequisites){

                if(prerequisite[1]==course){
                    incomeDegree[prerequisite[0]]--;
                    if(incomeDegree[prerequisite[0]]==0){
                        zeroDegree.add(prerequisite[0]);
                    }
                }

            }

        }
        for(int degree:incomeDegree){
            if(degree!=0){
                return false;
            }
        }
        return true;
    }
}
