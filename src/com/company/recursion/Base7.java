package com.company.recursion;

//https://leetcode.com/problems/base-7/
//504. Base 7

public class Base7 {

    public static void main(String[] args) {
        System.out.println(convertToBase7(100));
    }

    public static String convertToBase7(int num) {

        if(num == 0) return "0";
        if(num < 0) return "-" + convertToBase7(-num);

        StringBuilder stringBuilder = new StringBuilder();
        while (num>0){
            stringBuilder.append(num % 7);
            num/=7;
        }
        return stringBuilder.reverse().toString();
    }
}
