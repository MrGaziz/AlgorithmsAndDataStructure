package com.company.binarySearch;

import java.util.Arrays;

public class GuessNumberHigherorLower {

    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }

    static int pick = 5;

    public static int guessNumber(int n) {
        int left = 1;
        int right = n;
        int[] array = new int[n];
        Arrays.setAll(array, i -> i + 1);
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == pick) {
                return array[mid];
            }
            if (array[mid] > pick) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
