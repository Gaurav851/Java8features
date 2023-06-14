package com.javapractise.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {


    public static List<Employee> getAllEmployee(){

        return Stream.of(
                new Employee(101,"Gaurav","A",100000),
                new Employee(102,"Saurav","B",64343),
                new Employee(103,"Ritesh","C",20000),
                new Employee(104,"Mihir","B",62000),
                new Employee(105,"Naurav","A",80000)
        ).collect(Collectors.toList());

    }

}
