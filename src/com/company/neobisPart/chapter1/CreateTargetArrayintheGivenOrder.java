package com.company.neobisPart.chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/create-target-array-in-the-given-order/
//1389. Create Target Array in the Given Order

public class CreateTargetArrayintheGivenOrder {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 4, 3, 4};
        int[] index = new int[]{0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = (int) list.get(i);
        }
        return array;
    }
}
