package com.nou.lc.array;

/**
 * https://leetcode.com/problems/rotate-image/discuss/18872/A-common-method-to-rotate-the-image
 */
public class LC48 {

    public void rotate(int[][] matrix) {

        // first reverse up to down

        int up = 0 , down = matrix.length-1;
        while(up<down){

            int[] temp = matrix[up];
            matrix[up] = matrix[down];
            matrix[down] = temp ;
            up++;
            down--;
        }


        // then swap the symmetry

        for(int i=0;i<matrix.length;i++)
            for(int j=i+1;j<matrix.length;j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp ;

            }

    }
}
