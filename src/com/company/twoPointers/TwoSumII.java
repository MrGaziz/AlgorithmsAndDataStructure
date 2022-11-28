package com.company.twoPointers;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
//167. Two Sum II - Input Array Is Sorted

import java.util.Arrays;

public class TwoSumII {

    public static void main(String[] args) {
        int[] numbers = new int[]{5, 25, 75};
        System.out.println(Arrays.toString(twoSum(numbers, 100)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int r = numbers.length - 1;
        int[] res = new int[2];
        for (int l = 0; l < numbers.length - 1; l++) {
            int need = target - l;
            while (r - 1 > l && numbers[r] > need) {
                r--;
            }
            if (l < r && numbers[l] + numbers[r] == target) {
                res[0] = l + 1;
                res[1] = r + 1;
                return res;
            }
        }
        return res;
    }
}
