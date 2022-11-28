package com.company.arrays;

//https://leetcode.com/problems/maximum-subarray/
//53. Maximum Subarray
/*
 *  1. Создать две переменны один будет динамический менятся другой будет просто брать большое число
 *  2. Если на пути встретить - негативное значение то нужно каррент значение обнулять и в максимум
 *  3. И суммировать
 *
 * */
public class MaximumSubarray {

    public static void main(String[] args) {
        int[] i = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int i1 = maxSubArray(i);
        System.out.println(i1);
    }


    public static int maxSubArray(int[] nums) {
        int maxValue = nums[0];
        int tempValue = 0;
        for (int num : nums) {
            if (tempValue < 0) {
                tempValue = 0;
            }
            tempValue += num;
            maxValue = Math.max(maxValue, tempValue);
        }
        return maxValue;
    }
}
