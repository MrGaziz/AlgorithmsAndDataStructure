package com.company.setsAndMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/3sum/
//15. 3Sum
public class ThreeSum {

    public static void main(String[] args) {
        int[] i = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(i));

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return Collections.emptyList();
        }
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                }
                /*
                 * As the array is already sorted. j being the left pointer (pointing to lower numbers ) and k being
                 * the right pointer (pointing to higher numbers), with a static index i.
                 * If nums[i] + nums[j] + nums[k] is greater than target then we know we
                 * need to select the next highest number hence k--.
                 * Same way when the sum is lower we need to select a number just higher than the lowest.
                 *
                 * */
                else if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                }
            }
        }

        return new ArrayList<>(res);
    }
}
