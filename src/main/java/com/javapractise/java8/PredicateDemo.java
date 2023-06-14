package com.javapractise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {


    public static void main(String[] args) {
         Predicate<Integer> predicate=t -> t%2==0?true:false;
         System.out.println(predicate.test(9));


        List<Integer> list= Arrays.asList(1,2,3,4,5);

        list.stream().filter(predicate).forEach(t-> System.out.println("Print Even: "+t));

    }
}
