package com.company.loop;

import java.util.Arrays;

//https://leetcode.com/problems/reverse-string/
//344. Reverse String
public class ReverseString {

    public static void main(String[] args) {
        int[] s = new int[]{1, 3, 4, 5, 6, 7};
        int start = 0, l = s.length - 1;
        while (start < l) {
            int temp = s[start];
            s[start] = s[l];
            s[l] = temp;
            start++;
            l--;
        }
        System.out.println(Arrays.toString(s));

    }
}
