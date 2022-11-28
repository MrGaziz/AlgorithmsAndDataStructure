package com.company.neobisPart.chapter1;

import java.util.Arrays;

public class DecompressRunLengthEncodedList {

    public static void main(String[] args) {

    }

    public static int[] decompressRLElist(int[] nums) {
        //we should to define the length of the final value
        //because the first values define the freq
        int arraySize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arraySize += nums[i];
        }
        int[] res = new int[arraySize];
        int startPoint = 0;
        for (int i = 0; i < nums.length; i += 2) {
            /// fill what -  from -  to  - the value
            Arrays.fill(res, startPoint, startPoint + nums[i], nums[i + 1]);
            startPoint += nums[i];
        }
        return res;
    }
}
