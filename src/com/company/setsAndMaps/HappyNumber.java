package com.company.setsAndMaps;

public class HappyNumber {

    public static void main(String[] args) {

    }

    public boolean isHappy(int n) {

        if (n == 1 || n == 7) {
            return true;
        } else if (n < 10) {
            return false;
        }
        int total = 0;
        while (n != 0) {
            total += Math.pow(n % 10, 2);
            n /= 10;
        }
        return isHappy(total);
    }
}
