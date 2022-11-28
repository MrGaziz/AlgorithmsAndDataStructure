package com.company.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/*
* 1. создать две переменные которые будут содержать длину и ширину row and column массива
* 2. пробегаться по массиву и если же коллумн и роу будут ровны нулл то сохранять их в HashSet
* 3. Затем заново пробегаться по массиву и если видишь что данные contains 0 то менять массив на месте на нулл
* и все
*
* */
public class SetMatrixZeroes {

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void setZeroes(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        Set<Integer> row = new HashSet<>();
        Set<Integer> column = new HashSet<>();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    column.add(j);
                }
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (row.contains(i) || column.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
