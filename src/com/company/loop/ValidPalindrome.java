package com.company.loop;

import java.util.Locale;

//https://leetcode.com/problems/valid-palindrome/
//125. Valid Palindrome
/*
 * 1 Prepare string
 * 2 create variables
 * 3 check by index of first and last index
 * 4 if do not equal return false
 * 5 Do not remove numbers
 *
 * */
public class ValidPalindrome {

    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int fm = 0, lm = str.length() - 1;

        while (fm < lm) {
            if (str.charAt(fm) != str.charAt(lm)) {
                return false;
            }
            fm++;
            lm--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "a";
        boolean palindrome = isPalindrome(str);
        System.out.println(palindrome);
    }
}

//Leetcode
//class Solution {
//
//    public boolean isPalindrome(String str) {
//        if (str == null || str.length() == 0 ) {
//            return true;
//        }
//        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        int fm = 0, lm = str.length() - 1;
//
//        while (fm < lm) {
//            if (str.charAt(fm) != str.charAt(lm)) {
//                return false;
//            }
//            fm++;
//            lm--;
//        }
//        return true;
//    }
//}
