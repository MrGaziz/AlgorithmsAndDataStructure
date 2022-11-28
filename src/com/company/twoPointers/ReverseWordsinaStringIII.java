package com.company.twoPointers;

public class ReverseWordsinaStringIII {

    public static void main(String[] args) {
        String s = reverseWords("Let's take LeetCode contest");
        System.out.println(s);
    }

    public static String reverseWords(String s) {

        String[] split = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            StringBuilder stringBuilders = new StringBuilder();

            char[] chars = split[i].toCharArray();
            for (int j = chars.length - 1; j >= 0; j--) {
                stringBuilders.append(chars[j]);
            }
            if (i == 0) {
                stringBuilder.append(stringBuilders);
            } else {
                stringBuilder.append(" " + stringBuilders);
            }

        }
        return stringBuilder.toString();
    }
}
