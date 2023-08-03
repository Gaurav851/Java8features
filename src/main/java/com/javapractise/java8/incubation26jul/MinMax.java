package com.javapractise.java8.incubation26jul;


import com.javapractise.java8.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {

        // min max of list of integer

        System.out.println("Min of given list:"+Arrays.asList(5,7,3,1,99,29).stream()
                .min(Comparator.comparing(Integer::intValue)).get());

        System.out.println("Max of given Integer list: "+Arrays.asList(5,7,3,1,99,29)
                .stream()
                .max(Comparator.comparing(Integer::intValue)).get());

        // Min max charcater
        List<Character> chars = Arrays.asList(
                'a', 'b', 'c',
                'd', 'e', 'f',
                'g', 'h', 'i'
        );
        System.out.println("Min of given Char list :"+chars.stream()
                .min(Comparator.comparing(Character::charValue)).get());

        System.out.println("Max of given Char list :"+chars.stream()
                .max(Comparator.comparing(Character::charValue)).get());

        // Min max of String value

        List<String> names = Arrays.asList(
                "Putin",
                "Biden",
                "Modi",
                "Ali",
                "Jack"
        );
        System.out.println("Min of given String  list :"+names.stream()
                .min(Comparator.comparing(String::valueOf)).get());

        System.out.println("Max of given String list :"+names.stream()
                .max(Comparator.comparing(String::valueOf)).get());

        // Min max from Employee object
        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee(111,"AAA","D1",1000,"xyz@gmail.com"));
        employeesList.add(new Employee(222,"BBB",null,2000,"xyz@gmail.com"));
        employeesList.add(new Employee(333,"CCC","D2",3000,"xyz@gmail.com"));
        employeesList.add(new Employee(444,"DDD","D3",4000,"xyz@gmail.com"));
        employeesList.add(new Employee(555,"EEE","D2",5000,"xyz@gmail.com"));
        employeesList.add(new Employee(666,"FFF","D2",6000,"xyz@gmail.com"));

        System.out.println("Employee with Min Salary:"+employeesList.stream().min(Comparator.comparing(Employee::getSalary)).get());
        System.out.println("Employee with Max Salary:"+employeesList.stream().max(Comparator.comparing(Employee::getSalary)).get());



    }
}
