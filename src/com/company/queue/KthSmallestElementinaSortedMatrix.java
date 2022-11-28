package com.company.queue;

import java.util.PriorityQueue;

//https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/discuss/?currentPage=1&orderBy=hot&query=
//378. Kth Smallest Element in a Sorted Matrix
/*
*
* The easy approach is that we iterate all elements in the matrix and and add elements
* into the maxHeap.
* The maxHeap will keep up to k smallest elements (because when maxHeap is over size of k,
* we do remove
* the top of maxHeap which is the largest one). Finally, the top of the maxHeap is the kth the smallest
* element in the matrix.
This approach leads this problem become the same with 215. Kth Largest Element in an Array,
*  which doesn't take the advantage that the matrix is already sorted by rows and by columns
* */
public class KthSmallestElementinaSortedMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {1, 2, 3}, {6, 6, 7}};
        System.out.println(kthSmallest(matrix, 5));
    }

    public static int kthSmallest(int[][] matrix, int k) {
        int iLength = matrix.length;
        int jLenght = matrix[0].length;
        PriorityQueue<Integer> max = new PriorityQueue<>((o1, o2) -> Integer.compare(o2,o1));
        for (int i = 0; i < iLength; ++i) {
            for (int j = 0; j < jLenght; ++j) {
                max.offer(matrix[i][j]);
                if (max.size() > k) {
                    max.poll();
                }
            }
        }
        return max.peek();
    }
}
