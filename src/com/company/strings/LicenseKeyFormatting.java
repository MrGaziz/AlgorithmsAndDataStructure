package com.company.strings;

//https://leetcode.com/problems/license-key-formatting/submissions/
//482. License Key Formatting

public class LicenseKeyFormatting {

    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        System.out.println(s.length());
        System.out.println(licenseKeyFormatting(s, 4));
    }

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '-') {
                continue;
            }
            //You could alternatively simply count how many characters have been inserted since the
            // last dash.
            //DID NOT UNDERSTAND .length() % (k+1) == k
            if (stringBuilder.length() % (k + 1) == k) {
                stringBuilder.append("-");
            }
            stringBuilder.append(Character.toUpperCase(s.charAt(i)));
        }
        return stringBuilder.reverse().toString();
    }
}
