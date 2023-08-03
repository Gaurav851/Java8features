package com.javapractise.java8.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class prob1 {

    public static void main(String[] args) {


        List<Employee> list=
        Stream.of(
                new Employee(101,101,"Gaurav",29),
                new Employee(102,102,"Saurav",38),
                new Employee(103,101,"Ritesh",42),
                new Employee(104,104,"Mihir",62),
                new Employee(105,102,"Naurav",48)
        ).collect(Collectors.toList());

            list.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment,
                            HashMap::new,mapping(Employee::getName, toList())))
                    .forEach((k,v)-> System.out.println(k+"->"+v));

        list.stream()
                .collect(Collectors.toMap(Employee::getDepartment,Employee::getName))
                .forEach((k,v) -> System.out.println("Key : "+ k + " , Value : "+ v ));




    }
}
