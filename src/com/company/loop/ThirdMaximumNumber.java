package com.company.loop;

//414. Third Maximum Number
//https://leetcode.com/problems/third-maximum-number/

public class ThirdMaximumNumber {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 4, 5, 6, 7};
        Integer fm = null, sm = null, tm = null;
        for (int num : array) {
            if (fm == null || num > fm) {
                tm = sm;
                sm = fm;
                fm = num;
            } else if (fm == num) {
                return;
            } else if (sm == null || num > sm) {
                tm = sm;
                sm = num;
            } else if (sm == num) {
                return;
            } else if (tm == null || num > tm) {
                tm = num;
            }
        }

        System.out.println((tm != null) ? tm : fm);

    }
}
