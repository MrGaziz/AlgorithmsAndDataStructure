package com.company.setsAndMaps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//  https://leetcode.com/problems/intersection-of-two-arrays/submissions/
//  349. Intersection of Two Arrays

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 4, 5};
        int[] nums2 = new int[]{2, 2, 4, 4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> numsFset = new HashSet<>();

        for (int f : nums1) {
            numsFset.add(f);
        }

        Set<Integer> res = new HashSet<>();
        for (int n : nums2) {
            if (numsFset.contains(n)) {
                res.add(n);
            }
        }

        int[] finalResult = new int[res.size()];
        int index = 0;
        for (Integer i : res) {
            finalResult[index++] = i;
        }

        return finalResult;
    }
}
