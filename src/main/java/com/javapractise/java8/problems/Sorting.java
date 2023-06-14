package com.javapractise.java8.problems;


import com.javapractise.java8.Employee;
import com.javapractise.java8.EmployeeDatabase;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/** Given a list of integers, sort all the values present in it using Stream functions? */
public class Sorting {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        // Ascending order
        myList.stream().sorted()
                //.collect(Collectors.toList())
                .forEach(System.out::println);
        // Descending order
        System.out.println("Reverse Order");
        myList.stream().sorted(Collections.reverseOrder())
                .forEach(System.out::println);

        // Sorting Employee class Based on name field

        System.out.println("Sorting employee based on Name");
        EmployeeDatabase.getAllEmployee()
                .stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);

    }
}
