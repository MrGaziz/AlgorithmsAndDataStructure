package com.company.binarySearch;

public class Sqrt {

    public static void main(String[] args) {
        System.out.println(mySqrt(5));
    }

    public static int mySqrt(int x) {
        int l = 0;
        int r = x;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (mid * mid <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return (int) l;
    }

}
