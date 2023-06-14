package com.javapractise.java8.problems;

import java.util.Arrays;
import java.util.List;

// Given a list of integers, find out all the numbers starting with 1 using Stream functions?
public class NumberOper1 {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

        myList.stream()
                .map(i ->i+"")
                .filter(t -> t.startsWith("1"))
                .forEach(System.out::println);


    }
}
