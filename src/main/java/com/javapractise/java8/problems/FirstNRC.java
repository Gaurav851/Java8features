package com.javapractise.java8.problems;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNRC {

    public static void main(String[] args) {
        String input = "Java articles are Awesome";

        Character character = input.chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println("First non Repeating Char is "+character);


    }
}
