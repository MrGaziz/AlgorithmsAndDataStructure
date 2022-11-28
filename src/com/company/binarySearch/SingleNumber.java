package com.company.binarySearch;
//https://leetcode.com/problems/single-number/
//136. Single Number

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 4, 5, 5, 4, 3};
        System.out.println(singleNumber(nums));
    }

    // do XOR operation on all element using bit wise operator concept

    // for dry run take table of 1 to 9 base10 to binary
    // XOR all element u will get unique element
    public static int singleNumber(int[] nums) {

        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
}
