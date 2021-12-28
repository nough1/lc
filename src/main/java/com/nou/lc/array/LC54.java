package com.nou.lc.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 54 螺旋矩阵
 */
public class LC54 {

    /**
     * 螺旋矩阵顺序遍历
     * 错误1方向搞反了
     * 错误20的边界没有判断全
     * @param matrix
     * @return
     */
    public List<Integer> spiralOrder(int[][] matrix){

        List<Integer> result = new ArrayList<>();

        if(matrix.length==0){
            return result;
        }
        // m 行 n 列
        int m = matrix.length;
        int n = matrix[0].length;
        int[] dx= new int[]{0,1,0,-1};
        int[] dy= new int[]{1,0,-1,0};

        boolean[][] visited = new boolean[m][n];
        for(int i=0,x=0,y=0,d=0;i<n*m;i++){

            result.add(matrix[x][y]);
            visited[x][y] = true;
            int a = x+dx[d];
            int b = y+dy[d];

            if(a<0 || b<0 || a>=m || b>=n || visited[a][b]){
                d = (d+1)%4;
                a=x+dx[d];
                b = y+dy[d];
            }
            x = a;
            y = b;
        }
        return result;
    }
}
