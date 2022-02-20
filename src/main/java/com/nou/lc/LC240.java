package com.nou.lc;

/**
 * 搜索二维矩阵
 * https://leetcode.com/problems/search-a-2d-matrix-ii/
 * 考察编程，不含算法以及数据结构
 */
public class LC240 {

    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length==0||matrix[0].length==0){
            return false;
        }

        int row=0;
        int col = matrix[0].length-1;

        while (row<matrix.length && col>=0){

            if(matrix[row][col]==target){
                return true ;
            }else if(matrix[row][col]>target){
                col--;
            }else{
                row++;
            }

        }
        return false;
    }
}
