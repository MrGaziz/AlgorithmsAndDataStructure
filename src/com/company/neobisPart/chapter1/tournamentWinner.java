package com.company.neobisPart.chapter1;

import java.util.*;

class tournamentWinner {

    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < competitions.size(); i++) {
            ArrayList<String> strings = competitions.get(i);
            int iterationCount = results.get(i) > 0 ? 0 : 1;
            for (int j = 0; j < strings.size(); j++) {
                int points = 0;
                if (iterationCount == j)
                    points = 3;

                if (!hashMap.containsKey(strings.get(j))) hashMap.put(strings.get(j), points);
                else hashMap.put(strings.get(i), hashMap.get(strings.get(i)) + points);
            }
        }
        String key = Collections.max(hashMap.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();

        return key;
    }
}
