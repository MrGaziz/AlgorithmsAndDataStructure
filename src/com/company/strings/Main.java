package com.company.strings;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static int largestArea(int[][] mat) { // base case
        if (mat == null || mat.length == 0) return 0;
        // M × N matrix
        int M = mat.length;
        int N = mat[0].length;
        // maxsize stores the size of the largest square submatrix of 1's
        // and is passed by reference using the AtomicInteger class
        AtomicInteger maxsize = new AtomicInteger();
        //finding the largest sqaure
        findLargestSquare(mat, M - 1, N - 1, maxsize);
        return maxsize.get();
    }

    public static int findLargestSquare(int[][] mat, int m, int n, AtomicInteger maxsize) { // base condition
        if (m == 0 || n == 0) {
            if (maxsize.get() != 0) {
                maxsize.set(Integer.max(maxsize.get(), mat[m][n]));
                return mat[m][n];
            }
            for (int i = 0; i <= m; i++) {
                if (mat[i][n] == 1) {
                    maxsize.set(1);
                    break;
                }
            }
            for (int j = 0; j <= n; j++) {
                if (mat[m][j] == 1) {
                    maxsize.set(1);
                    break;
                }
            }
            return maxsize.get();
        } // find the largest square matrix ending at mat[m][n-1]
        int left = findLargestSquare(mat, m, n - 1, maxsize);
        // find the largest square matrix ending at mat[m-1][n]
        int top = findLargestSquare(mat, m - 1, n, maxsize);
        // find the largest square matrix ending at mat[m-1][n-1]
        int diagonal = findLargestSquare(mat, m - 1, n - 1, maxsize);
        /* The largest square matrix ending at mat[m][n] will be 1 plus minimum of largest square matrix ending at mat[m][n-1], mat[m-1][n] and mat[m-1][n-1] */
        int size = 0;
        if (mat[m][n] != 0) {
            size = 1 + Integer.min(Integer.min(top, left), diagonal);
        } // update maximum size found so far
        maxsize.set(Integer.max(maxsize.get(), size));
        // return the size of the largest square matrix ending at mat[m][n]
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Taking input from the user
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        } //Output of the given problem
        System.out.println("Output:\n" + largestArea(mat));
    }
}