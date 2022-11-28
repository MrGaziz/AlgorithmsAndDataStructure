package com.company.setsAndMaps;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-the-difference-of-two-arrays/
//2215. Find the Difference of Two Arrays

public class FindtheDifferenceofTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{4, 2, 6};
        System.out.println(findDifference(nums1, nums2));

    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> listFirst = new ArrayList<>();
        List<Integer> listSecond = new ArrayList<>();

        for (int i : nums1) {
            if (!listFirst.contains(i)) {
                listFirst.add(i);
            }
        }
        for (int i : nums2) {
            if (!listSecond.contains(i)) {
                listSecond.add(i);
            }
        }

        List<Integer> tempList = new ArrayList<>(listFirst);

        listFirst.removeAll(listSecond);
        listSecond.removeAll(tempList);

        res.add(listFirst);
        res.add(listSecond);
        return res;
    }

}
