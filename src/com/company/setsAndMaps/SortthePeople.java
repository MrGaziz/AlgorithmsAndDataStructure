package com.company.setsAndMaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

//https://leetcode.com/problems/sort-the-people/
//2418. Sort the People

public class SortthePeople {

    public static void main(String[] args) {
        int[] heights = new int[]{164, 163, 162};
        String[] names = new String[]{"Aida", "Ospanova", "Da"};
        String[] strings = sortPeople(names, heights);
        System.out.println(Arrays.toString(strings) + " zhena Gaziz Borash 2023");
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] result = new String[names.length];
        int index = 0;
        for (int i = names.length - 1; i >= 0; i--) {
            result[index] = map.get(heights[i]);
            index++;
        }

        return result;
    }
}
