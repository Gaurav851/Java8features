package com.javapractise.java8.problems.practise;

import java.util.stream.Stream;

public class FindSmallest {
    //Find the smallest missing number
    //Input: {0, 1, 2, 6, 9}, n = 5, m = 10
    //Output: 3

    public static void main(String[] args) {

        int input[]= {0, 1, 2, 6, 9};
        int n = 5, m = 10;
        System.out.println("1. Smallest missing number is :"+findSmallestMissingNumber(input,n,m));
        System.out.println("2. Smallest missing number is :"+findSmallestMissingNumber(new int[]{4, 5, 10, 11},4,12));
        System.out.println("2. Smallest missing number is :"+findSmallestMissingNumber(new int[]{0, 1, 2, 3},4,5));
        System.out.println("2. Smallest missing number is :"+findSmallestMissingNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 10},9,11));
    }

    private static int findSmallestMissingNumber(int[] input, int n, int m) {

        int i=0;
        while(i<n){
            if(input[i]!=i){
                return i;
            }
            i++;
        }
        return i;
    }
}
