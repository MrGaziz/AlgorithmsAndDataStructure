package com.company.loop;
//https://leetcode.com/problems/longest-continuous-increasing-subsequence/
//674. Longest Continuous Increasing Subsequence
/*
1. Проверить на нулл
2. Проверить перый элемент с поледующим
3. если последующий выше увеличить tem
4. Для length выбрать то что выше между temp и length С помощью Math.max(length, temp)
5. если последующий не выше то temp == 1
6. Выбрать резульат
*/

public class LongestContinuousIncreasingSubsequence {

    public static void main(String[] args) {
        int[] num = new int[]{1, 3, 5, 4, 7};
        int lengthOfLCIS = findLengthOfLCIS(num);
        System.out.println(lengthOfLCIS);
    }

    public static int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int temp = 1;
        int length = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                temp++;
                length = Math.max(length, temp);
            } else {
                temp = 1;
            }

        }
        return length;
    }
}


