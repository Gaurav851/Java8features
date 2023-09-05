package com.javapractise.java8.problems.practise;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Reverse Words in a String
//Input: "the sky is blue"
//Output: "blue is sky the"
public class ReverseWord {

    public static void main(String[] args) {
        String sentence="the sky is blue";
        System.out.println("Reverse words: "+reverseWord(sentence));
        //System.out.println("Reverse words: "+reverseWordUsingRecursion(sentence));
    }

    private static StringBuffer reverseWord(String sentence) {


        int i=0,j=sentence.length()-1;
        String str[]=sentence.split(" ");
        String reverseSentences="";
        for (int k = 0; k <str.length/2 ; k++) {
           String temp=str[i];
            str[i]=str[str.length-1-i];
            str[str.length-1-i]=str[i];
        }

        return new StringBuffer(str.toString());
    }

}
