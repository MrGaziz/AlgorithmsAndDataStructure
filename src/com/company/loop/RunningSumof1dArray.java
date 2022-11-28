package com.company.loop;
//https://leetcode.com/problems/running-sum-of-1d-array/?envType=study-plan&id=level-
//1480. Running Sum of 1d Array

/*
* Взять данные из предыдущего и добавлять
* */
import java.util.Arrays;

public class RunningSumof1dArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,1,1};
        int[] ints = runningSum(nums);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            if (i == 0) {
                array[i] = nums[i];
            } else {
                array[i] = array[i - 1] + nums[i];
            }

        }
        return array;
    }
}
