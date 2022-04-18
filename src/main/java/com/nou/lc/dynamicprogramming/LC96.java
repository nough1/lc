package com.nou.lc.dynamicprogramming;

/**
 * https://leetcode.com/problems/unique-binary-search-trees/
 * https://www.youtube.com/watch?v=Ox0TenN3Zpg
 * 递归的分析思想 : 将一个大问题分解成几个小问题 . ( 重复的子问题 )
 */
public class LC96 {

    public int numTrees(int n) {

        int[] result = new int[n+1];
        result[0]=1;
        result[1]=1;

        for(int i=2;i<=n;i++){

            int total = 0;
            for(int root=1;root<=i;root++){

                // 这个地方需要思考下
                int left = root-1;
                int right = i - root;

                // 为什么这里是相乘法
                total+=result[left]*result[right];

            }
            result[i] =total;
        }
        return result[n];
    }
}
