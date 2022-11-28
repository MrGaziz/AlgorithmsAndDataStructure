package com.company.sortingstructsIntervals;

public class FindTheDifference {

    public static void main(String[] args) {
        System.out.println(findTheDifference("asad", "asa"));
    }


    public static char findTheDifference(String s, String t) {
        if (s.length() > t.length()) {
            char[] substring = s.substring(t.length()).toCharArray();
            return substring[0];
        } else if (t.length() > s.length()) {
            char[] substring = t.substring(s.length()).toCharArray();
            return substring[0];
        } else {
            return ' ';
        }
    }

}
