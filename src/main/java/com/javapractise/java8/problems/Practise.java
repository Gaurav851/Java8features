package com.javapractise.java8.problems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practise {
    public static void main(String[] args) {

    List<Integer> number = Arrays.asList(10,15,8,49,25,98,32);

    number.stream()
            .filter(t-> t%2==0)
            .collect(Collectors.toList()).forEach(System.out::println);

        // Number starting with 1
        System.out.println("Number starting with 1");
        number.stream()
                .map(t->t+"")
                .filter(k-> k.startsWith("1"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // To Find duplicate numbers from list

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set= new HashSet<>();
        myList.stream().filter(k-> !set.add(k))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Find the first element of the list
        System.out.println("Number starting with 1");
        List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println("Print First element from list");
        myList1.stream()
                .findFirst()
                .ifPresent(System.out::println);

        // First non repeating character

        String input = "Java articles are Awesome";

                   input.chars()
                           .mapToObj(k-> Character.toLowerCase(Character.valueOf((char) k)))
                           .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                           .entrySet()
                           .stream()
                           .filter(s -> s.getValue()>1)
                           //.map(entry -> entry.getKey())
                           .findFirst()
                           .ifPresent(k-> System.out.println("First NRC:" +k.getKey()));




    }


}
