package com.company.setsAndMaps;

//https://leetcode.com/problems/isomorphic-strings/?envType=study-plan&id=level-1
//205. Isomorphic Strings

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        Map map = new HashMap();
        map.putIfAbsent("S", 1);
        map.putIfAbsent("S", 2);
        map.putIfAbsent("S", 3);
        map.putIfAbsent("S", 4);
        System.out.println(map);
//        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        if (sChars.length != tChars.length) {
            return false;
        }

        Map<Object, Object> mapS = new HashMap<>();
        Map<Object, Object> mapT = new HashMap<>();
        for (int i = 0; i < sChars.length; i++) {
            // Для того, чтобы добавить пару в Map необходимо было делать следующее
            Object o = mapS.putIfAbsent(s.charAt(i), i);
            Object o1 = mapT.putIfAbsent(t.charAt(i), i);
            if (o1 != o) {
                return false;
            }
        }
        return true;

    }
}
