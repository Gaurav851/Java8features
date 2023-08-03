package com.javapractise.java8.problems;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * How to count each element/word from the String ArrayList in Java8?
 */
public class CountWords {

    public static void main(String[] args) {
        wordCount("asd");
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        names.stream()
                .collect(Collectors.groupingBy(Function.identity(),HashMap::new,Collectors.counting()))
                .forEach((k,v)-> System.out.println(k+":"+v));

        /** How to find only duplicate elements with its count from the String ArrayList in Java8?
         *
         */
        System.out.println("Finding Duplicate Elements");
        names.stream()
                .collect(Collectors.groupingBy(Function.identity(),HashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(k ->k.getValue()>1)
                .forEach(t-> System.out.println(t.getKey()+" "+t.getValue()));

    }


    public static void wordCount(String str){

        String strSentence = " Hi EPAM bye EPAM goodbye EPAM welcome ePAM Hi There epAM bye bye EPaM";

            List<String> wordList=Arrays.asList(strSentence.split(" "));
            wordList.stream()
                    .map(k-> k.toUpperCase())
                    .collect(Collectors.groupingBy(Function.identity(),HashMap::new, Collectors.counting()))
                    .entrySet()
                    .stream().filter(entry -> entry.getValue()>1)
                    .forEach(entry -> System.out.println(entry.getKey()+":" +entry.getValue()));

    }
}
