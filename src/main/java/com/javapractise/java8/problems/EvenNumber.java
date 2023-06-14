package com.javapractise.java8.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(10,23,4,7,32,37,19);

        list.stream().filter(t-> t%2==0).collect(Collectors.toList()).forEach(System.out::println);
    }
}
