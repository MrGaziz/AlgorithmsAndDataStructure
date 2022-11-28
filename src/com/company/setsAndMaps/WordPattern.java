package com.company.setsAndMaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args) {
        System.out.println(wordPatternL("ab", "happy hacking"));
        System.out.println(wordPatternG("abba", "dog cat cat fish"));

    }

    public static boolean wordPatternR(String pattern, String s) {
        String[] arr = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        if (arr.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(arr[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(arr[i])) {
                    return false;
                }
                map.put(c, arr[i]);
            }
        }
        return true;
    }

    public static boolean wordPatternL(String pattern, String s) {
        String[] split = s.split(" ");
        if (pattern.length() != split.length) {
            return false;
        }
        Map<Object, Object> map = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            if (map.putIfAbsent(pattern.charAt(i), i) != map.putIfAbsent(split[i], i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean wordPatternG(String pattern, String s) {

        char[] chars = pattern.toCharArray();
        String[] split = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        map.put(chars[0], split[0]);

        for (int j = 1; j <= split.length - 1; j++) {
            if (!map.containsKey(chars[j])) {
                map.put(chars[j], split[j]);
            } else if (!map.get(chars[j]).equals(split[j])) {
                return false;
            }
        }
        return true;
    }
}
