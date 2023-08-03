package com.javapractise.java8.problems;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *Write a program to Find element occurring odd number of times in given Array?
 */
public class OddOccurance {

    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,1,5,2,1,8,2,3,5,8);

        numList.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(k ->k.getValue()%2!=0)
                .forEach(k-> System.out.println(k.getKey()));

    }


}
