package com.company.setsAndMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountofSmallerNumbersAfterSelf {

    public static void main(String[] args) {
        int[] in = new int[]{5,2,6,1};
        List<Integer> integers = countSmaller(in);
        System.out.println(integers);

    }

    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for (int indx = 0; indx <= nums.length - 1; indx++) {
            int count = 0;
            int j = indx;
            for (; j <= nums.length - 1; j++) {
                if (nums[j] < nums[indx]) {
                    count++;
                }
            }
            j++;
            res.add(count);
        }
        return res;
    }
}
