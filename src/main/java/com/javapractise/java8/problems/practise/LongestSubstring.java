package com.javapractise.java8.problems.practise;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    //Longest Substring Without Repeating Characters:

    public static void main(String[] args) {

        String str= "abcabcbb";

        //abc
        System.out.println(""+LongestSubstringWithoutRepChar(str));
    }

    private static String LongestSubstringWithoutRepChar(String str) {
        Set<Character> set= new HashSet<Character>();
        String longString="";
        for (int i = 0; i < str.length(); i++) {
            if(!set.add(str.charAt(i)) && longString.length()<set.size()){
                    longString = set.toString();
                    set.clear();
                }
        }
        return longString;
    }
}
