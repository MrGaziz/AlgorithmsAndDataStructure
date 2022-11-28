package com.company.queue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;

//https://leetcode.com/problems/top-k-frequent-words/
//692. Top K Frequent Words

public class TopKFrequentWords {

    static class Pair {

        String word;
        int freq;

        public Pair(String word, int freq) {
            this.word = word;
            this.freq = freq;
        }
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        System.out.println(topKFrequent(strings, 3));
    }

    public static List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }

        PriorityQueue<Pair> pairs = new PriorityQueue<>((o1, o2) -> {
            if (o1.freq == o2.freq) {
                return o1.word.compareTo(o2.word);
            }
            return o2.freq - o1.freq;
        });

        for (String s : map.keySet()) {
            Pair pair = new Pair(s, map.get(s));
            pairs.add(pair);
        }
        List<String> res = new ArrayList<>();

        while (k-- > 0) {
            res.add(Objects.requireNonNull(pairs.poll()).word);
        }
        return res;
    }
}
