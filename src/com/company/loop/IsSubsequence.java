package com.company.loop;
//https://leetcode.com/problems/is-subsequence/?envType=study-plan&id=level-1
//392. Is Subsequence

/*
 * 1. создал массив символ от слово
 * 2. пробегаясь по массиву взял индекс символа
 * 3. пробегаясь по массиву взял индекс символа by indexOf()
 * 4. если индекс слово равно -1 то выводим фолс
 * 5. если нет то сабстринс начиная с индекса
 *
 * */
public class IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("aaaaaa", "bbaaaa"));
    }

    public static boolean isSubsequence(String s, String t) {
        char[] chars = s.toCharArray();

        for (char c : chars) {
            int i = t.indexOf(c);
            if (i != -1) {
                t = t.substring(i + 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
