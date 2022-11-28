package com.company.stack;

//https://leetcode.com/problems/evaluate-reverse-polish-notation/
//150. Evaluate Reverse Polish Notation

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static void main(String[] args) {
        String[] strings = new String[]{"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(strings));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a, b;
        for (String s : tokens) {

            if (s.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (s.equals("-")) {
                a = stack.pop();
                b = stack.pop();
                stack.push(a - b);
            } else if (s.equals("/")) {
                a = stack.pop();
                b = stack.pop();
                stack.push(a / b);
            } else if (s.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

}
