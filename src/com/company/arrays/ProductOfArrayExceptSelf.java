package com.company.arrays;

import java.util.Arrays;

/*
* 1. Нужно создать массив
* 2. Попутно нужно сохранять темп значения
* 3. этот темп нужно приравнивать в начала в результат
* 4. затем после заполнения нужно начать с лева подсчет
* 5. с лева темп нужно умножать на результат
* 6. затем умножать на массив по счету
*
* */

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3, 4};
        int[] ints = productExceptSelf(test);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int temp = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = temp;
            int num = nums[i];
            temp *= num;
        }
        temp = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= temp;
            temp *= nums[i];
        }
        return res;
    }
}
