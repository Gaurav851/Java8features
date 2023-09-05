package com.javapractise.java8.incubation26jul;

import com.javapractise.java8.Employee;
import com.javapractise.java8.EmployeeDatabase;
import com.javapractise.java8.Transaction;

import java.util.*;
import java.util.function.*;
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


        // 8. TO find the Most frequently used char

        String str4= "I am a java programmer in epam";


        Arrays.stream(str4.replace(" ","").split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                //.max(Map.Entry.comparingByValue())
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                //.sorted(Comparator.comparing(Map.Entry.comparingByValue(Comparator.reverseOrder())))
                //.forEach(entry -> System.out.println(entry.getKey()+"::"+entry.getValue()));
                .findFirst().ifPresent(System.out::println);


        System.out.println("move all even to end");
        int arr1 [] = { 1,2,3,4,5,6,7,8,9,10 };

       // Given an int array move all the even numbers to the right.

        //Output is: int arr [] = { 1,2,3,4,5,6,7,8,9,10} -> Expected out put is : { 1,3,5,7,9,2,4,6,8,10}

        int arr [] = { 1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.partitioningBy(t ->t%2==0))
                .entrySet()
                .stream()
                .flatMap(t -> t.getValue().stream())
                .collect(Collectors.toList())
                .forEach(System.out::print);

        //Filter unique (first name + 2 character of last name)employees and get top 8 employees First name , last name.




        // Find the  nth Largest word remove duplicates in the string

        int n1=2;
        String sentence ="Hello my name is Gaurav";


        String s2 = Arrays.asList(sentence.split(" "))
                .stream().sorted(Comparator.comparing(String::length).reversed())
                .skip(n1 - 1).findFirst().get();

        System.out.println("First nth largest word::"+s2);

        // Remove duplicate in a string

        String s9= "gaurav";
        s9.chars()
                .distinct()
                .mapToObj(c -> (char)c)
                .collect(Collectors.toList())
                .forEach(System.out::print);

        // You have a list of transactions. Each transaction has an amount and a currency.
        // Group the transactions by currency and calculate the total count of transactions and the sum of amounts for each currency.

        Transaction.getAllTransactions().stream()
                .collect(Collectors.groupingBy(Transaction::getCurrency,Collectors.counting())
                ).forEach((k,v) -> System.out.println(k+"===="+v));


        String word="I work at epam and epam is good at making people learn new skills";

        Arrays.asList(word.split(" ")).stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(System.out::println);

        String input1 = "the quick brown fox jumps right over the little lazy dog little";
        System.out.println(">>>>>>>>>>>>>>>>>>>");
        Arrays.asList(input1.split(" ")).stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry ->entry.getValue()>1L)
                .findFirst()
                .ifPresent(System.out::println);


        String input2 = "the quick brown fox jumps right over the little lazy dog little";
        System.out.println("2>>>>>>>>>>>>>>>>>>>");
        Arrays.asList(input2.split(" ")).stream()
                .collect(Collectors.maxBy(Comparator.comparing(String::length)))
                .ifPresent(System.out::println);

        EmployeeDatabase.getAllEmployee().
                stream().collect(Collectors.groupingBy(Employee::getGrade,Collectors.toSet()));


        Function f= new Function() {
            @Override
            public Object apply(Object o) {
                return null;
            }
        };

        Consumer c = new Consumer() {
            @Override
            public void accept(Object o) {

            }
        };

        Predicate p= new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };

        Supplier s1= new Supplier() {
            @Override
            public Object get() {
                return null;
            }
        };

        BiFunction bf = new BiFunction() {
            @Override
            public Object apply(Object o, Object o2) {
                return null;
            }
        };





    }
}
