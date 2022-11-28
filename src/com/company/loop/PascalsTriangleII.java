package com.company.loop;

//https://leetcode.com/problems/pascals-triangle-ii/
// 119. Pascal's Triangle II

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> prev = null, row;

        for (int i = 0; i <= rowIndex; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(prev.get(j - 1) + prev.get(j));
                }
            }
            prev = row;
            result.add(row);
        }
        return result.get(rowIndex);
    }
}
