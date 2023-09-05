package com.javapractise.java8.incubation26jul;

import java.util.Stack;

public class ParanthesisChecker {
    public static void main(String[] args) {
        String exp="[()]{}{[()()]()}";

        System.out.println(exp+":"+validateParanthesis(exp));
        String exp1="[(])";
        System.out.println(exp1+":"+validateParanthesis(exp1));
    }

    private static boolean validateParanthesis(String exp) {
        Stack<Character> stack= new Stack<>();

        for(int i=0;i<exp.length();i++) {
            char c = exp.charAt(i);
            switch (c) {
                case '[':
                case '{':
                case '(': {
                    stack.push(c);
                    break;
                }

                case ']':
                case '}':
                case ')': {
                    if (!stack.isEmpty() ) {
                        char c1=stack.peek();
                        if((c==')' && c1=='(') || (c=='}' && c1=='{') || (c==']' && c1=='['))
                        stack.pop();
                    } else
                        stack.push(c);
                    break;
                }

            }
        }
            if(stack.isEmpty())
                return true;
            else
                return false;
        }
}
