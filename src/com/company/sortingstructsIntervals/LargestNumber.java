package com.company.sortingstructsIntervals;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//https://leetcode.com/problems/largest-number/
//179. Largest Number

/*
* 1. Тут важно было использовать Comparator чтобы вычислить какая комбинация лучше подходит
* Arrays.sort(strings, comparator);
* */
public class LargestNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{19, 2};
        System.out.println(largestNumber(nums));
    }


    public static String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "0";
        }

        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }
        Comparator<String> comparator = (o1, o2) -> {
            String s1 = o1 + o2;
            String s2 = o2 + o1;
            return s2.compareTo(s1);
        };

        Arrays.sort(strings, comparator);
        if(strings[0].charAt(0)=='0') return "0";

        StringBuilder stringBuilder = new StringBuilder();
        for(String s:strings){
            stringBuilder.append(s);
        }
        return stringBuilder.toString();

    }

}
