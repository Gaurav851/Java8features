package com.javapractise.java8;

import java.util.Arrays;

public class Problem2 {

    public static void main(String[] args) {

        int [] arr ={3,1,6,5,8,4,3,9};

        // Need to fimd the sum of even numbers



        int sum=Arrays.stream(arr)
                .filter(num -> num%2==0)
                .sum();
        System.out.println("Sum of Even numbers:"+sum);


       int sumParallel= Arrays.stream(arr).parallel()
                .filter(num ->num%2==0)
                .sum();

        System.out.println("Sum of even using parallel streams.:"+ sumParallel);

    }
}
