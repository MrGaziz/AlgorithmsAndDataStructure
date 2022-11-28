package com.company.twoPointers;

import java.util.Arrays;

//https://leetcode.com/problems/sort-colors/
//https://leetcode.com/problems/sort-colors/discuss/2102161/Java-or-100-Faster-or-Visual-Representation-or-Three-Pointer-or-O(N)
//75. Sort Colors
public class SortColors {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] >= nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }


        }
    }
}

