package com.company.queue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

//https://leetcode.com/problems/top-k-frequent-elements/
//347. Top K Frequent Elements
/*
* https://leetcode.com/problems/top-k-frequent-words/discuss/2722113/Java-Simple-approach-with-Explanation-and-comments
Store all the words in a map with their frequency.
Create a Priority Queue of Pair type with custom comparator, which will sort the Pair first on the
basis of frequency and later on the lexicographical order of their words.
Add all the elements from map to priority queue.
Get the top k elements from Priority queue and add it to answer list.
Return the list.
*
* */
public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 5, 5, 5};
        System.out.println(Arrays.toString(topKFrequent(nums, 1)));
    }

    static class Pair {

        int number;
        int freq;

        public Pair(int number, int freq) {
            this.number = number;
            this.freq = freq;
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Pair> pairs = new PriorityQueue<>((o1, o2) -> o2.freq - o1.freq);

        for (int i : map.keySet()) {
            Pair pair = new Pair(i, map.get(i));
            pairs.add(pair);
        }

        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = pairs.poll().number;
        }

        return res;
    }
}

