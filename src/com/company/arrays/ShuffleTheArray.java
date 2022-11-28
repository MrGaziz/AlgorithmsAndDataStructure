package com.company.arrays;

//https://leetcode.com/problems/shuffle-the-array/
//1470. Shuffle the Array

import java.util.Arrays;

public class ShuffleTheArray {

    public static void main(String[] args) {
        int[] in = new int[]{2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(in, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int fistPart = 0;
        int secondPart = n;
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; ) {
            res[i++] = nums[fistPart++];
            res[i++] = nums[secondPart++];
        }
        return res;

    }
}
