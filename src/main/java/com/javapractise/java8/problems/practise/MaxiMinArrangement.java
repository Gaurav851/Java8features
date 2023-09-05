package com.javapractise.java8.problems.practise;

import java.util.Arrays;

public class MaxiMinArrangement {

    // Rearrange an array in maximum minimum form using Two Pointer Technique

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        MaxMinArrangement(arr, arr.length);

    }

    private static void MaxMinArrangement(int[] arr, int length) {

        int [] temp= new int[length];
        boolean isSmallTurn=false;
        int j=0,k=length-1;
        for (int i = 0; i < length; i++) {
            if (isSmallTurn) {
                temp[i] = arr[j++];
                isSmallTurn=false;
            } else {
                temp[i] = arr[k--];
                isSmallTurn=true;
            }
        }
        arr=temp.clone();
        Arrays.stream(arr).forEach(System.out::println);
        }

}
