package com.company.sort;
//https://leetcode.com/problems/maximum-product-of-three-numbers/
//628. Maximum Product of Three Numbers
/*
 *Thus, it could also be possible that two negative numbers lying at the left extreme end could
 * also contribute to lead to a larger product if the third number in the triplet being considered
 * is the largest positive number in the numsnums array.
 *
 * */

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {

    public static void main(String[] args) {
        int[] i = new int[]{-100, -98, -1, 2, 3, 4};
        System.out.println(maximumProduct(i));
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        return Math.max(nums[0] * nums[1] * nums[length - 1],
            nums[length - 1] * nums[length - 2] * nums[length - 3]);
    }
}
