package com.company.neobisPart.chapter1;

public class FindFirstPalindromicStringintheArray {
    public static void main(String[] args) {

    }

    public String firstPalindrome(String[] words) {
        for (String word : words) {
            int lengthInnerWord = word.length();
            int f = 0, l = lengthInnerWord - 1;
            while (f < l) {
                if (word.charAt(f) != word.charAt(l))
                    break;
                f++;
                l--;
            }
            return word;
        }
        return "";
    }
}
