package com.company.arrays;

import java.util.Arrays;
//https://leetcode.com/problems/concatenation-of-array/submissions/
//1929. Concatenation of Array


public class ConcatenationofArray {

    public static void main(String[] args) {
        int[] in = new int[]{1, 1, 1};
        System.out.println(Arrays.toString(getConcatenation(in)));
    }

    //    i%a.length will iterate repeatedly from 0 to a.length-1.


    public static int[] getConcatenation(int[] nums) {
        int length = nums.length * 2;
        int[] a = new int[length];
        for (int i = 0; i < length; i++) {
            a[i] = nums[i % nums.length];
        }
        return a;
    }
}
