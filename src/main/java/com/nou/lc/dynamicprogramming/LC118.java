package com.nou.lc.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle/
 *
 * 这个题目实际上跟 dp 关系不大，主要是找规律
 *
 */
public class LC118 {


    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<numRows;i++){

            List<Integer> row = new ArrayList<>();

            // 这里的难点是 index
            for(int j=0;j<=i;j++){

                if(j==0||j==i){
                    row.add(1);
                }else{

                    int a = result.get(i-1).get(j);
                    int b = result.get(i-1).get(j-1);
                    row.add(a+b);
                }


            }
            result.add(row);
        }
        return result;
    }
}
