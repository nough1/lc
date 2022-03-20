package com.nou.lc.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/n-queens/
 * backtracking
 *
 */
public class LC51 {

    private Set<Integer> colSet = new HashSet<>();
    private Set<Integer> negDiagSet = new HashSet<>();
    private Set<Integer> posDiagSet = new HashSet<>();

    public List<List<String>> solveNQueens(int n) {


        char[][] board = new char[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                board[i][j] = '.';

        List<List<String>> result  = new ArrayList<>();
        backTracking(0,result,n,board);

        return result;
    }

    public void backTracking(int row,List<List<String>> result,int n,char[][] board){

        if(row==n){

            List<String> solution = new ArrayList<>();
            for(int i=0;i<n;i++){

                StringBuilder sb = new StringBuilder();
                for(int j=0;j<n;j++){
                    sb.append(board[i][j]);
                }
                solution.add(sb.toString());
            }

            result.add(solution);
            return;
        }

        for(int col=0;col<n;col++){

            if(colSet.contains(col) || posDiagSet.contains(row+col) || negDiagSet.contains(row-col))continue;
            board[row][col] ='Q';
            colSet.add(col);
            negDiagSet.add(row-col);
            posDiagSet.add(row+col);
            backTracking(row+1,result,n,board);

            colSet.remove(col);
            posDiagSet.remove(row+col);
            negDiagSet.remove(row-col);
            board[row][col]='.';
        }
        return;
    }
}
