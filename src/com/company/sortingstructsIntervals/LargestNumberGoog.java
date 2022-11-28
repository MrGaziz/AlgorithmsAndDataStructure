package com.company.sortingstructsIntervals;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/largest-number/
//179. Largest Number
public class LargestNumberGoog {

    public static void main(String[] args) {
        int[] nums = new int[]{10, 2};
        System.out.println(largestNumber(nums));
    }


    public static String largestNumber(int[] nums) {
        int length = nums.length;
        List<String> ints = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            if (nums[i] < 10) {
                ints.add("" + nums[i]);
            } else {
                String s1 = "" + nums[i];
                String[] split = s1.split("");
                ints.addAll(Arrays.asList(split));
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        ints.sort(Collections.reverseOrder());
        for (String i : ints) {
            stringBuffer.append(i);
        }
        System.out.println(stringBuffer);
        return "";
    }

}
