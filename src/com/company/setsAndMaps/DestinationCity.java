package com.company.setsAndMaps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/destination-city/
//1436. Destination City
public class DestinationCity {

    public static void main(String[] args) {
        List<String> d = Arrays.asList("A", "B");
        List<String> d1 = Arrays.asList("B", "Z");
        List<String> d2 = Arrays.asList("X", "W");
        List<List<String>> paths = Arrays.asList(d, d1, d2);
        System.out.println(destCity(paths));
    }

    public static String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> path : paths) {
            String start = path.get(0);
            set.add(start);
        }
        for (List<String> path : paths) {
            String des = path.get(1);
            if (!set.contains(des)) {
                return des;
            }
        }
        return "";
    }

}
