package com.company.binarySearch;

//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/discuss/512165/Java-binary-search-beats-100-explained
//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
//1351. Count Negative Numbers in a Sorted Matrix

public class CountNegativeNumbersinASorteMatrix {

    //        [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
//
    public static void main(String[] args) {
        int[][] j = new int[][]{{1, -3, -4, 5}, {1, -3, -4, 5}};
        System.out.println(countNegatives(j));
    }

    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
/*
* The solution to this problem is quite simple - use binary search for each row of the matrix.
The purpose of binary search is to find the first negative number.
If the assumed number is negative, then we know for sure that all the numbers to the right of it
are also negative. Therefore, we move the right border.

* If the assumed number is positive, then we know for sure that
 all the numbers to the left of it are also positive.
* */
//
//    public int countNegatives(int[][] grid) {
//        int count = 0;
//        for(int i = 0; i < grid.length; i++){
//            count += findNegativeNums(grid[i]);
//        }
//        return count;
//    }
//
//    public int findNegativeNums(int[] row) {
//        int l = 0;
//        int r = row.length;
//
//        while(l < r){
//            int mid = l + (r - l)/2;
//            if(row[mid] < 0) r = mid;
//            else l = mid + 1;
//        }
//        return row.length - l;
//    }

