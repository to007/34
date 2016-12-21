package com.company;

/**
 * Created by to007 on 12/21/16.
 */
public class MatrixMult {
    public static int[][] mult(int[][] x, int[][] y){
       int [][] c = new int[x.length][y[0].length];
        int count = 0;
        for(int i = 0;i < c.length; i++){
            count = 0;
            for(int j = 0;j < c[0].length; j++){
                count += x[i][j] * y[j][i];
                c[i][j] = count;
            }
        }
            return c;
    }
}
