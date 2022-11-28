package com.company.sort;

//https://leetcode.com/problems/valid-anagram/
//242. Valid Anagram

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        boolean anagram = isAnagram("naaafa", "nagaram");
        System.out.println(anagram);
    }

    public static boolean isAnagram(String s, String t) {
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        Arrays.sort(charsS);
        Arrays.sort(charsT);
        if (!Arrays.equals(charsS, charsT)) return false;
        return true;
    }
}
