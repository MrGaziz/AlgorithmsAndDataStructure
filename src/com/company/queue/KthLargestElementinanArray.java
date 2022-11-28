package com.company.queue;

import java.util.PriorityQueue;

public class KthLargestElementinanArray {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(nums, 4));

    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Это гениальное решщение так как мы берем два эелемента и
        for (int i : nums) {
            queue.add(i);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }

}
