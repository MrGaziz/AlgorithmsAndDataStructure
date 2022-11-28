package com.company.stack;

//https://leetcode.com/problems/backspace-string-compare/
//844. Backspace String Compare

import java.util.Stack;

public class BackspaceStringCompare {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("y#fo##f","y#f#o##f"));
    }

    public static boolean backspaceCompare(String s, String t) {

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();

        for(char c: sChars) {
            if(c=='#' && !sStack.isEmpty())
                sStack.pop();
            else if (c !='#')
                sStack.push(c);
        }

        for(char c: tChars) {
            if(c=='#' && !tStack.isEmpty())
                tStack.pop();
            else if (c!='#')
                tStack.push(c);
        }
        System.out.println(sStack);
        System.out.println(tStack);

        return sStack.equals(tStack);
    }
}
