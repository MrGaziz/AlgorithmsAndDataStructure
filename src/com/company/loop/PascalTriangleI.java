package com.company.loop;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle/
//118. Pascal's Triangle

/*
 * Первое это нужно создать Массив для результата
 * Второе это нужно создать Массив для сохранения предыдущий записи и для сохранения роу
 * Нужно прогнать цикл numRows
 * И внутри циклы создать второй цикл по отдельным роуам
 * Внутри саб цикла создать массив для сохранения роу
 * и добавить условие что цикл будет работать до тех пор пока не будет равно <= i
 * и если данные равные нулл или же концу цикла то ставится один
 * если нет то суммируем данные от предыдущего листа где для первого элемента берем предпоследную и текущую которая равно j
 * и в конце цикла добавляем в результат в роу и теущий сохраняем
 * */
public class PascalTriangleI {

    public static void main(String[] args) {
        System.out.println(generate(4));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> prev = null, row;
        for (int i = 0; i < numRows; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(prev.get(j - 1) + prev.get(j));
                }
            }
            prev = row;
            res.add(row);

        }
        return res;
    }
}
