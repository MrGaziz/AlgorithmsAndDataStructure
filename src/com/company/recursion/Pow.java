package com.company.recursion;
//https://leetcode.com/problems/powx-n/discuss/2771360/Pow(xn)-java-Solution-oror-Easy-Explanation
//https://leetcode.com/problems/powx-n/

public class Pow {

    public static void main(String[] args) {
        System.out.println(1 / myPow(2.00000, -2));
    }

    public static double myPow(double x, int n) {
        double result = 1.0;
        if (n < 0) {
            return 1/myPow(x, -n);
        }
        while (n > 0) {
            if (n % 2 == 0) {
                x = x * x;
                n /= 2;
            } else {
                result = result * x;
                n--;
            }
        }
        return result;
    }
}
