package com.company.loop;

//14. Longest Common Prefix
//https://leetcode.com/problems/longest-common-prefix/
//
//  Input: strs = ["flower","flow","flight"]
//  Output: "fl"
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strings = new String[]{"flower", "flow", "flight"};
        if (strings.length == 0) System.out.println("");

        char[] prefix = strings[0].toCharArray();

        for (int i = 0; i < prefix.length; i++) {
            char[] innerString = strings[i].toCharArray();
            for (char in : innerString) {

            }
            prefix[i] = (innerString[i] == prefix[i]) ? prefix[i] : null;

        }
    }
}
