package com.javapractise.java8.problems.practise;

import java.util.Arrays;
import java.util.Comparator;

public class ThreeLargestNumber {
        // Find the largest three elements in an array
    public static void main(String[] args) {

        int arr[] = {10, 4, 3, 50, 23, 90};

        print3largestWithStream(arr,arr.length);
        print3largestWithoutStream(arr,arr.length);

    }

    private static void print3largestWithoutStream(int[] arr, int length) {

        int first,second,third;
        first=second=third=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }

        }
        System.out.println("Without using streams");
        System.out.println("First:"+first+ " second: "+second+" third:"+third);
        }


    private static void print3largestWithStream(int[] arr, int length) {

        Arrays.stream(arr)
                .boxed().sorted(Comparator.reverseOrder())
                .limit(3).forEach(System.out::println);
    }
}
