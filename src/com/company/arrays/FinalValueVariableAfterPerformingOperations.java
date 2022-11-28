package com.company.arrays;

//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
//2011. Final Value of Variable After Performing Operations

public class FinalValueVariableAfterPerformingOperations {

    public static void main(String[] args) {
        String[] strings = new String[]{"--X", "X++", "X++"};
        int i = finalValueAfterOperations(strings);
        System.out.println(i);
    }

    public static int finalValueAfterOperations(String[] operations) {

        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            x = (operations[i].charAt(1) == '+') ? x++ : x--;
        }
        return x;
    }


}
