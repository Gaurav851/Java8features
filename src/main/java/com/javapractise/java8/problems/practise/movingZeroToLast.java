package com.javapractise.java8.problems.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class movingZeroToLast {
    // moving all zeros to last
    public static void main(String[] args) {

        int a[]={1, 2, 0, 4, 3, 0, 5, 0};
        movingNumberToLast(a,0);
        movingNumberToLastWithStream(a,0);

    }

    private static void movingNumberToLastWithStream(int[] a, int i) {
        System.out.println("Using streams :"+
        Arrays.stream(a).boxed()
                .collect(Collectors.partitioningBy(integer -> integer == 0))
                .entrySet()
                .stream()
                .flatMap(t -> t.getValue().stream())
                .collect(Collectors.toList()).size());


    }

    private static void movingNumberToLast(int[] a, int k) {
        int counter=0;

        for (int i = 0; i < a.length; i++) {

            if(a[i]!=0){
                a[counter++]=a[i];
            }

        }

        while(counter<a.length){
            a[counter++]=k;
        }
        for (int n = 0; n < a.length; n++) {
            System.out.println(a[n]);
        }



    }
}
