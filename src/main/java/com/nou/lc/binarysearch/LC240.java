package com.nou.lc.binarysearch;

/**
 * https://leetcode.com/problems/search-a-2d-matrix-ii/solution/
 * rule out by one row or one col
 */
public class LC240 {

    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix==null || matrix.length==0 || matrix[0].length==0){
            return false ;
        }
        // define the first search location
        int row = 0 , col = matrix[0].length-1;
        while(row<matrix.length && col>=0){

            if(target == matrix[row][col]){
                return true ;
            }else if(target<matrix[row][col]){
                col--;
            }else{
                row++;
            }

        }
        return false ;

    }
}
