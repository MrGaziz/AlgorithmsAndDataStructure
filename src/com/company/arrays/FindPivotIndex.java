package com.company.arrays;
//https://leetcode.com/problems/find-pivot-index/
//724. Find Pivot Index

/*
 * первое это нужно создать переменные которые равны 0
 * потом нужно добавить весь их сум
 * затем нужно создать другой цикл
 * и в этом цикле нужно каждый раз отнимать первый элемент и проверять равно или нет
 * если же равно то получается этот элемент является pivot
 * если же нет то этот элемент является не пивот
 * */

public class FindPivotIndex {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {

        int i = 0;
        int totalSum = 0;
        int leftSum = 0;
        while (i < nums.length) {
            totalSum += nums[i];
            i++;
        }

        for (int j = 0; j < nums.length; j++) {
            if (totalSum - nums[j] == leftSum) {
                return j;
            } else {
                totalSum = totalSum - nums[j];
                leftSum = leftSum + nums[j];
            }
        }

        return -1;
    }
}
