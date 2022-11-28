package com.company.neobisPart.chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingaRule {

    public static void main(String[] args) {
        List<String> sample1 = Arrays.asList("phone","blue","pixel");
        List<String> sample2 = Arrays.asList("phone","gold","iphone");
        List<String> sample3 = Arrays.asList("computer","silver","lenovo");
        List<List<String>> list = new ArrayList<>();
        list.add(sample1);
        list.add(sample2);
        list.add(sample3);

        int i = countMatches(list, "color", "silver");
        System.out.println(i);
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int key = 0;
        int res = 0;
        if (ruleKey.equals("color")) key = 1;
        else if (ruleKey.equals("type")) key = 0;
        else if (ruleKey.equals("name")) key = 2;

        for(int i = 0; i<items.size(); i++){
            List<String> secList = items.get(i);
               String s = secList.get(key);
                if(s.equals(ruleValue)) {
                    res++;
                }
        }
        return res;
    }

}
