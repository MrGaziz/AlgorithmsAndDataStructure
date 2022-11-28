package com.company.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/subsets/
//78. Subsets

public class Subsets {

    public static void main(String[] args) {
        int[] i = new int[]{1, 2, 3};
        System.out.println(subsets(i));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(lists, new ArrayList<>(), nums, 0);
        return lists;
    }

    public static void backtracking(List<List<Integer>> lists, List<Integer> tempList, int[] nums,
        int start) {
        lists.add(new ArrayList<>(tempList));

        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtracking(lists, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
