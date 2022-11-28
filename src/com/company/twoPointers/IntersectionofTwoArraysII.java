package com.company.twoPointers;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/
//350. Intersection of Two Arrays II

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionofTwoArraysII {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3, 4, 5, 6};
        int[] nums2 = new int[]{0, 2, 4, 7, 6};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return null;
        }

        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int pointer = 0;

        for (int i = 0; i < nums1.length; i++) {
            int nums2Variable = nums2[pointer];
            int nums1Variable = nums1[i];

            while (pointer + 1 < nums2.length && nums2Variable < nums1Variable) {
                pointer++;
            }

            if (pointer < nums2.length && nums1Variable == nums2Variable) {
                res.add(nums1Variable);
                pointer++;
            }
        }
        int[] resultArray = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resultArray[i] = res.get(i);
        }

        return resultArray;
    }
}
