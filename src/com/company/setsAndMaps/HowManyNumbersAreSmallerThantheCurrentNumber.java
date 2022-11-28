package com.company.setsAndMaps;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThantheCurrentNumber {

    public static void main(String[] args) {
        int[] in = new int[]{6,5,4,8};
        int[] ints = smallerNumbersThanCurrent(in);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];

        for (int indx = 0; indx <= nums.length - 1; indx++) {
            int count = 0;
            for (int j = 0; j <= nums.length - 1; j++) {
                if (nums[indx] > nums[j]) {
                    count++;
                }
            }
            res[indx] = count;
        }
        return res;
    }
}
