package com.company.setsAndMaps;
//169. Majority Element
//https://leetcode.com/problems/majority-element/

import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        int majorityCount = nums.length / 2;

        for (int i : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == i) {
                    count += 1;
                }
            }
            if (count > majorityCount) {
                return i;
            }
        }
        return -1;
    }
}
