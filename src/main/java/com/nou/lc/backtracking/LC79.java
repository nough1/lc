package com.nou.lc.backtracking;

/**
 * https://leetcode.com/problems/word-search/
 * https://www.acwing.com/video/1413/
 * 需要图形化理解下，不太好写
 */
public class LC79 {

    public boolean exist(char[][] board, String word) {

        int rows = board.length;
        int cols = board[0].length;
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++){

                if(exist(board,i,j,0,word)){
                    return true;
                }


            }
        return false;
    }

    public boolean exist(char[][] board,int row,int col,int index,String word){


        // 以这个为起点的第一个不匹配，直接结束
        if(board[row][col]!=word.charAt(index)){
            return false;
        }

        // 匹配上了，而且是最后一个，直接返回匹配

        if(index==(word.length()-1)){
            return true;
        }

        char temp = board[row][col];
        board[row][col]='.';
        int[] dx= {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        for(int i=0;i<4;i++){

            int a = row+dx[i];
            int b = col+dy[i];
            if(a<0 ||a>=board.length||b<0||b>=board[0].length||board[a][b]=='.'){
                continue;
            }
            if(exist(board,a,b,index+1,word)){
                return true;
            }
        }
        // 为什么要还原
        board[row][col]=temp;
        return false;


    }
}
