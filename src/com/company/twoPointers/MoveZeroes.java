package com.company.twoPointers;
//https://leetcode.com/problems/move-zeroes/
//283. Move Zeroes

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 8, 4, 5, 0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        int left = 0;
        int size = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[left] = nums[i];
                left++;
            }
        }
        while (left < size) {
            nums[left] = 0;
            left++;
        }

    }
}
