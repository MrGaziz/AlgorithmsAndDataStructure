package com.company.setsAndMaps;
//https://leetcode.com/problems/count-the-number-of-consistent-strings/
//1684. Count the Number of Consistent Strings

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CounttheNumberOfConsistentStrings {

    public static void main(String[] args) {
        String[] strings = new String[]{"ad", "bd", "aaab", "baa", "badab"};
        int ab = countConsistentStrings("ab", strings);
        System.out.println(ab);
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        return Arrays.stream(words)
                .mapToInt(w -> w.chars()
                .allMatch(c -> allowed.contains((char) c + "")) ? 1 : 0)
                .sum();
    }
}
