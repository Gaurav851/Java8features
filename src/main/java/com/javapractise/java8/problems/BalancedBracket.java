package com.javapractise.java8.problems;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBracket {

    public static void main(String args[]){

        String exp="[()]{}{[()()]()}";
        System.out.println("Is balanced Expresssion :"+FindBalancedbracket(exp));

    }



    private static boolean FindBalancedbracket(String exp) {

        Deque<Character> stack
                = new ArrayDeque<Character>();
        char a[]=exp.toCharArray();



        int i=0;

        while(i<exp.length()){
           char c= exp.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                i++;
            }
            else
            {
                 if(stack.isEmpty())
                     return false;

                char last=stack.pop();
                if(c==')' && last=='(' || c=='}' && last=='{' || c==']' && last=='[')
                    i++;
                else
                    return false;

            }
        }
        return true;

    }

}
