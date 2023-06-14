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

        int a=2;
        IntStream ins= IntStream.of(2,3,4).map(s->s*a);
       // a=2;
        ins.forEach(System.out::println);
    }
}
