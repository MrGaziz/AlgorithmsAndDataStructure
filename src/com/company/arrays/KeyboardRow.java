package com.company.arrays;
//https://leetcode.com/problems/keyboard-row/
//500. Keyboard Row
/*
 * 1. Первое это создать мапу все слова будут хранится в ключ и значениях
 * 2. Потом для первой бувы слова беру его первую букву и определяю индекс через мапу
 * 3. Если же мапа не подходит то ставлю индекс на -1 и скипаю
 * 4. Если же данные подходят то я просто беру данные и сохраняю в массив Линдекд листа.
 *
 * */

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class KeyboardRow {

    public static void main(String[] args) {
        String[] wordsArrays = new String[]{"Alaska", "Hello", "Dad"};
        System.out.println(Arrays.toString(findWords(wordsArrays)));
    }

    public static String[] findWords(String[] words) {
        String[] wordsArrays = new String[]{"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < wordsArrays.length; i++) {
            for (var c : wordsArrays[i].toCharArray()) {
                map.put(c, i);//put <char, rowIndex> pair into the map
            }
        }
        List<String> res = new LinkedList<>();
        for (String word : words) {
            if (word.equals("")) {
                continue;
            }
            var index = map.get(word.toLowerCase().charAt(0));
            char[] chars = word.toLowerCase().toCharArray();
            for (char c : chars) {
                if (!map.get(c).equals(index)) {
                    index = -1;
                    break;
                }
            }
            if (index != -1) {
                res.add(word);
            }
        }
        return res.toArray(new String[0]);
    }
}
