package com.company.twoPointers;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/summary-ranges/
//228. Summary Ranges
public class SummaryRanges {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 4, 5, 7};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> strings = new ArrayList<>();
        if (nums.length == 1) {
            strings.add(nums[0] + "");
            return strings;
        }

        for (int counter = 0; counter < nums.length; counter++) {

            int initialValue = nums[counter];
            while (counter + 1 < nums.length && nums[counter + 1] - nums[counter] == 1) {
                counter++;
            }

            if (initialValue != nums[counter]) {
                strings.add(initialValue + "->" + nums[counter]);
            } else {
                strings.add(initialValue + "");
            }
        }
        return strings;
    }
}
