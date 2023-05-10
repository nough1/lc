package com.nou.nowcoder;

import java.util.Scanner;

/**
 * 最长公共子串问题
 */
public class HJ65 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();

        // mantain max matrix

        int[][] matrix = new int[s1.length()+1][s2.length()+1];
        int maxLength = 0;
        int endIndex = 0;
        for(int i=1;i<=s1.length();i++)
            for(int j=1;j<=s2.length();j++){

                if(s1.charAt(i)==s2.charAt(j)){

                    matrix[i][j] = matrix[i-1][j-1]+1;

                    if(matrix[i][j]>maxLength){
                        maxLength = matrix[i][j];
                        endIndex = i;
                    }

                }else{

                    matrix[i][j] = 0;

                }
            }
        System.out.println(maxLength);
        StringBuilder sb = new StringBuilder();
            for(int i=(endIndex-maxLength);i<maxLength;i++){
                sb.append(s1.charAt(i));
            }
        System.out.println(sb.toString());
    }
}
