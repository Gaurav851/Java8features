package com.javapractise.java8.problems;

import java.util.Arrays;
import java.util.List;

/**
 * Given a list of integers, find the maximum value element present in it using Stream functions?
 */
public class FindMax {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        myList.stream()
                .max(Integer::compare)
                .ifPresent(System.out::println);

    }
}
