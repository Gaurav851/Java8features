package com.javapractise.java8.problems.practise;


import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Segregate even and odd numbers
Input: arr[] = {7, 2, 9, 4, 6, 1, 3, 8, 5}
Output: 2 4 6 8 7 9 1 3 5
 */
public class OddEvenSeg {

    public static void main(String[] args) {

        int arr[] = {7, 2, 9, 4, 6, 1, 3, 8, 5};
        segEvenOddUsingStream(arr,arr.length);

        System.out.println("After segEvenOddWithoutStream:---- ");
       segEvenOddWithoutStream(arr,arr.length);


       Arrays.stream(arr).forEach(System.out::println);
    }

    private static void segEvenOddWithoutStream(int[] arr, int length) {

        int i,j;
        i=-1;j=0;

        while(j!=length){
            if(arr[j]%2==0){
                i++;

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            j++;
        }
    }

    private static void segEvenOddUsingStream(int[] arr, int length) {

        System.out.println("Even odd segregation with Streams: ");

        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.partitioningBy(num -> num%2!=0))
                .entrySet()
                .stream()
                .flatMap(t -> t.getValue().stream())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
