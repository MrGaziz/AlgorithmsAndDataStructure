package com.company.neobisPart.chapter1;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
//1431. Kids With the Greatest Number of Candies

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {

    public static void main(String[] args) {
        int[] res = new int[] {2,3,5,1,3};

        System.out.println(kidsWithCandies(res, 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxValue = Arrays.stream(candies).max().getAsInt();
        List<Boolean> res = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxValue) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}
