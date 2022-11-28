package com.company.strings;

//https://leetcode.com/problems/reverse-words-in-a-string/
//151. Reverse Words in a String

public class ReverseWordsInAString {

    public static void main(String[] args) {
        String test = "  hello world  ";
        System.out.println(reverseWords(test));
    }

    public static String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        int i1 = split.length - 1;
        for (int i = i1; i >= 0; i--) {
            if (i == i1) {
                stringBuilder.append(split[i]);
            } else {
                stringBuilder.append(" ").append(split[i]);
            }
        }

        return stringBuilder.toString().trim().replaceAll("\\s{2,}", " ").trim();
    }
}
