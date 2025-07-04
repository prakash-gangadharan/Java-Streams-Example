package com.java.learn;

import java.util.Stack;

public class CheckForBalancedParenthesesInExpression {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == ')' || c == '}' || c == ']') {
                return false; //unmatched closing bracket
            }
        }
        return stack.isEmpty(); //if stack is empty, all brackets are matched
    }

    public static void main(String[] args) {
        String data = "{24 + 28} + [{(2+3) - (1+1)}]";
        String data2 = "{24 + 28} + [{(2+3) - (1+1)]"; // Example with unbalanced brackets
        System.out.println(data + " is valid: " + isValid(data)); //true
        System.out.println(data2 + " is valid: " + isValid(data2)); //false
    }
}
