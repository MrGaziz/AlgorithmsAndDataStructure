package com.company.twoPointers;
//https://leetcode.com/problems/reverse-vowels-of-a-string/
//345. Reverse Vowels of a String

public class ReverseVowelsofaString {

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }

    static boolean isVowels(char s) {
        return s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' ||
            s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U';
    }

    public static String reverseVowels(String s) {
        int l = 0;
        int r = s.length() - 1;
        char[] chars = s.toCharArray();
        while (l < r) {
            if (!isVowels(chars[l])) {
                l++;
            } else if (!isVowels(chars[r])) {
                r--;
            } else {
                char temp = ' ';
                temp = chars[l];
                chars[l] = chars[r];
                chars[r] = temp;
                l++;
                r--;
            }
        }
        return new String(chars);
    }
}
