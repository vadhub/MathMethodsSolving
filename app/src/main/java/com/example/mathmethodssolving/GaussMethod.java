package com.example.mathmethodssolving;

import java.util.Arrays;

public class GaussMethod {
    public static int gauss(int[] matrix) {

        return 0;
    }

    public static int[][] pivotSwap(int[][] matrix, int row) {
        int n = matrix.length;
        int elem = matrix[0][row];
        int min = 0;
        for (int i = 0; i < n -1; i++) {
            if (Math.abs(elem) > Math.abs(matrix[i + 1][row])) {
                elem = matrix[i + 1][row];
                min = i + 1;
            }
        }
        swapRow(matrix, 0, min);
        return matrix;
    }

    public static void swapRow(int[][] matrix, int rowA, int rowB) {
        int[] tmpRow = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = tmpRow;
    }

    public static int[][] zeroField(int[][] m) {

        for (int i = 0; i < m[0].length; i++) {
            m[1][i] = m[1][i] - (m[1][0]/m[0][0])*m[0][i];
            System.out.println(m[1][i]);
        }

//        m[1][0] = m[1][0] - (m[1][0]/m[0][0])*m[0][0];
//        m[1][1] = m[1][1] - (m[1][0]/m[0][0])*m[0][1];
//        m[1][2] = m[1][2] - (m[1][0]/m[0][0])*m[0][2];
//        m[1][3] = m[1][3] - (m[1][0]/m[0][0])*m[0][3];

        for (int i = 0; i < m[0].length; i++) {
            m[2][i] = m[2][i] - (m[2][0]/m[0][0])*m[0][i];
        }

//        m[2][0] = m[2][0] - (m[2][0]/m[0][0])*m[0][0];
//        m[2][1] = m[2][1] - (m[2][0]/m[0][0])*m[0][1];
//        m[2][2] = m[2][2] - (m[2][0]/m[0][0])*m[0][2];
//        m[2][3] = m[2][3] - (m[2][0]/m[0][0])*m[0][3];

        return m;
    }

    public static void print(int[][] b) {
        for (int[] ints : b) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
