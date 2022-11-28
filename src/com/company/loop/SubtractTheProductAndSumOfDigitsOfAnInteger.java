package com.company.loop;

// Given an integer number n, return the difference between the product of its digits and the sum of its digits.
// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
// 1281. Subtract the Product and Sum of Digits of an Integer
public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    /*
        1.Создать сумм
        2.Создать продакт
        3.Создать вайл лупп
        4.Взять остаток %
        5.Затем делить /
        6.Остаток прогонять
        7.Взять результат

    */
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;
        int x = 234;
        while (x > 0) {
            int i = x % 10;
            sum += i;
            product *= i;
            x /= 10;
        }
        System.out.println(sum + " " + product);
    }
}
