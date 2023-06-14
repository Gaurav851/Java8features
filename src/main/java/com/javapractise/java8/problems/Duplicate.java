package com.javapractise.java8.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**  Given an integer array nums, return true if any value appears at least twice in the array,
 *  and return false if every element is distinct.*/
public class Duplicate {
    public static void main(String[] args) {

        int[] num = {1,2,3,5};

        Set<Integer> set = new HashSet<>();

        boolean present = Arrays.stream(num)
                .boxed()
                        .anyMatch(t->!set.add(t));

        System.out.println(present);

    }


}
