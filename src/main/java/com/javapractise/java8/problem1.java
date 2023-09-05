package com.javapractise.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class problem1 {
    public static void main(String[] args) {
        int arr[] = {4,0,9,3,1,0,1};
        int k=0;
        moverNumberToRight(arr,k);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // mSub array with max sum
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        maxSubArraySum(a,a.length);
        findMaxSubArraySumIndex(a,a.length);
    }

    public static void moverNumberToRight(int a[],int b){
        int index=0;

        for (int i = 0; i <a.length ; i++) {
            if(a[i]!=b){
                a[index++]=a[i];
            }

        }

        while(index<a.length){
            a[index++]=0;
        }
    }

    public static void maxSubArraySum(int a[], int size)
    {
        int max_so_far = Integer.MIN_VALUE,
                max_ending_here = 0, start = 0, end = 0, s = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here += a[i];

            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }

            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        System.out.println("Maximum contiguous sum is "
                + max_so_far);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
    }

        //   int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };

    public static void findMaxSubArraySumIndex(int a[],int n){
        int max=Integer.MIN_VALUE;
        int sum=0;
        int _start=0,_end=0;

        for (int i = 0; i < a.length; i++) {
           sum+= a[i];
            if(max<sum){
                max=sum;
                _end=i;
            }
             if(sum<0){
                sum=0;
                _start=i+1;
                _end=_start;
            }
        }

        System.out.println("Max Sum:" +max+ "Start:"+_start+" End: "+-_end);

    }
}
