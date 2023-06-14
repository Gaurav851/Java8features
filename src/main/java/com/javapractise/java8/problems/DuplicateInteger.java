package com.javapractise.java8.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * How to find duplicate elements in a given integers list in java using Stream functions
 */
public class DuplicateInteger {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 15, 98, 32);

        Set<Integer> set= new HashSet<>();
        myList.stream()
                .filter(t-> !set.add(t))
                .forEach(System.out::println);

    }
}
