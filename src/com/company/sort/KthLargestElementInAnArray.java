package com.company.sort;

//https://leetcode.com/problems/kth-largest-element-in-an-array/
//215. Kth Largest Element in an Array
/*
* 1. Отсортировать данные в аскендин ордере
* 2. Взять данные с конца по K так как требуется взять с конца вторую
*
* */

import java.util.Arrays;

public class KthLargestElementInAnArray {

    public static void main(String[] args) {
        int[] i = new int[]{3, 2, 1, 5, 6, 4};
        System.out.println(findKthLargest(i, 2));
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int num = nums[nums.length - k];
        return num;
    }
}
