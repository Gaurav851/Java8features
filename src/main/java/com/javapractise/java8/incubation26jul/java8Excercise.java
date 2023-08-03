package com.javapractise.java8.incubation26jul;

import com.javapractise.java8.EmployeeDatabase;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java8Excercise {

    public static void main(String[] args) {

        // 1 : Given a sentence find the word that has the highest length. The solution is:
        //
        String s = "I am interested to grow in my organization";
        Stream.of(s.split(" ")).max(Comparator.comparing(String::length)).ifPresent(System.out::println);

        // 2.Given a sentence find the word that has the 2nd (Nth) highest length.
        int n=2;
        System.out.println("Second highest length word: "+Stream.of(s.split(" "))
                .sorted(Comparator.comparing(String::length).reversed()).skip(n-1).findFirst().get());

      // 3. Find the length of the longest word

        System.out.println("ength of the longest word:" +Stream.of(s.split(" "))
                .mapToInt(t ->t.length()).max().getAsInt());

       // 4. Find the 2nd highest length word in the given sentence

        System.out.println("2nd highest length word in the given sentence:"
                +Arrays.stream(s.split(" "))
                .map(l -> l.length())
                .sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

        //5 . Given a sentence, find the number of occurrence of each word.

        String input = "the quick brown fox jumps right over the little lazy dog little";

        Stream.of(input.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((k,v) -> System.out.println(k+"->"+v));

        // 6. Given a word, find the occurrence of Each Character

        String str="organization";

        Stream.of(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((k,v) -> System.out.println(k+"->"+v));

       //  7. There is a list of Employees and Employee object has a field called e-mail.
        //  Find the list of domains ( gmail.com, yahoo.com..) and the no of occurrences for each domain.

        EmployeeDatabase.getAllEmployee().stream()
                .map(e ->e.getEmail().substring(e.getEmail().indexOf("@")+1))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((k,v)-> System.out.println(k+"->>"+v));


                   //     String z= "abc@yahoo.com";
                 //   System.out.println(">>>>>>>"+z.substring(z.indexOf("@")));





    }
}
