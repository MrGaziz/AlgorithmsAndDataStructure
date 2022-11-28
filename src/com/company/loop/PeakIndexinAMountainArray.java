package com.company.loop;

//852. Peak Index in a Mountain Array
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
/*
 *Approach 1: Horizontal scanning
   1. Берем первый элемент как префикс
   2. Чтобы не разбигаться второй раз мы берем уже второй элемент массива
   3. Второй элемент будет рабигаться до тех пор пока indexOf не удовлетворит
   4. В это время мы будем делать substring() substring обрезает
   5. После того как элемент равен будет равен 0 цикл заканчивается
 * */

public class PeakIndexinAMountainArray {

    public static void main(String[] args) {
        String strs = "Rozert Junior";
        String prefix = "Gaziz";
        int i = strs.indexOf(prefix);
        while (i != 0) {
            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) System.out.println("  ");
        }
        System.out.println(prefix);

    }
}
//class Solution {
//
//    public String longestCommonPrefix(String[] strs) {
//        String prefix = strs[0];
//
//        for (int i = 1; i < strs.length; i++) {
//            //пока не равно
//            while (strs[i].indexOf(prefix) != 0) {
//                prefix = prefix.substring(0, prefix.length() - 1);
//                if (prefix.length() == 0) return "";
//            }
//        }
//        return prefix;
//    }
//}
