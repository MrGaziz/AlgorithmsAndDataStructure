package com.company.stack;

//https://leetcode.com/problems/valid-parentheses/
//20. Valid Parentheses

/**
 * For opening parenthesis, we push them to the stack. For closing ones, we check that the top
 * parenthesis in the stack is a matching one, and remove it. Finally, stack should be empty after
 * all operations.
 */

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        boolean valid = isValid("{}}{}{}");
        System.out.println(valid);
    }

    public static boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();

        char[] chars = s.toCharArray();
        if (s == null || s.length() == 0) {
            return true;
        }

        for (char c : chars) {
            if (c == '(' || c == '{' || c == '[') {
                characterStack.push(c);
            } else if (c == ')') {
                if (characterStack.isEmpty() || characterStack.pop() != '(') {
                    return false;
                }
            } else if (c == '}') {
                if (characterStack.isEmpty() || characterStack.pop() != '{') {
                    return false;
                }
            } else if (c == ']') {
                if (characterStack.isEmpty() || characterStack.pop() != '[') {
                    return false;
                }
            }
        }

        return characterStack.isEmpty();
    }

}
