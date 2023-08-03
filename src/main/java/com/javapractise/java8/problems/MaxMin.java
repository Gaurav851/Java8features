package com.javapractise.java8.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static com.sun.javafx.scene.traversal.Hueristic2D.findMin;

public class MaxMin {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        findMin(numbers);
        findMax(numbers);
    }

    private static void findMax(List<Integer> numbers) {

        Integer integer = numbers.stream()
                .min(Comparator.comparing(Integer::intValue))
                .get();

        System.out.println("Min number :"+ integer);
    }

    private static void findMin(List<Integer> numbers) {
        Integer integer = numbers.stream()
                .min(Comparator.comparing(Integer::intValue))
                .get();

        System.out.println("Max number :"+ integer);
    }
}
