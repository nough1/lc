package com.nou.lc.dynamicprogramming;

/**
 * dynamic program
 * https://www.youtube.com/watch?v=XYi2-LPrwm4
 * https://leetcode.com/problems/edit-distance/
 */
public class LC72 {

    public int minDistance(String word1, String word2) {


        int[][] cache = new int[word1.length()+1][word2.length()+1];

        for(int col=0;col<word2.length()+1;col++){

            cache[word1.length()][col] = word2.length()-col;

        }

        for(int row=0;row<word1.length()+1;row++){
            cache[row][word2.length()] = word1.length()-row;
        }

        for(int row=word1.length()-1;row>=0;row--)
            for(int col=word2.length()-1;col>=0;col--){

                if(word1.charAt(row)==word2.charAt(col)){
                    cache[row][col] = cache[row+1][col+1];
                }else{
                    cache[row][col] = 1+Math.min(Math.min(cache[row+1][col],cache[row][col+1]),cache[row+1][col+1]);
                }
            }
        return cache[0][0];
    }
}
