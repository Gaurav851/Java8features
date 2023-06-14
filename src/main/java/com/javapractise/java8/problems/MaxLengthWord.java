package com.javapractise.java8.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class MaxLengthWord {

    public static void main(String[] args) {

        // Stream.of("army" ,"man","mumbai").max(Comparator.comparing(String::Length));
       // String arr= new String[]{"army" ,"man","mumbai"};
        List<java.lang.String> list= Arrays.asList("army" ,"man","mumbai");
        java.lang.String s = list.stream().max(Comparator.comparing(java.lang.String::length)).get();

        System.out.println(s);

    }
}
