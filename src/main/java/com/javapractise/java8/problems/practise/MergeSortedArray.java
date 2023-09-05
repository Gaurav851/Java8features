package com.javapractise.java8.problems.practise;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

        int ar1[] = {1, 5, 9, 10, 15, 20};
        int ar2[] = {2, 3, 8, 13};

        int finalArray[]=mergeTwoSortedArrays(ar1,ar2);

        Arrays.stream(finalArray).forEach(System.out::println);
    }

    private static int[] mergeTwoSortedArrays(int[] ar1, int[] ar2) {

        int final_array[]=new int[ar1.length+ar2.length];

        int i=0,j=0,k=0;

        while(i<ar1.length && j<ar2.length){

            if(ar1[i]< ar2[j]){
                final_array[k++]=ar1[i];
                i++;
            }
            else if(ar1[i]> ar2[j]){
                final_array[k++]=ar2[j];
                j++;
            }

        }

        if(i<ar1.length){
            for (int l = i; l <ar1.length ; l++) {
                final_array[k++]=ar1[l];
            }
        }
        if(j<ar2.length){
            for (int l = j; l <ar2.length ; l++) {
                final_array[k++]=ar2[l];
            }
        }


        return final_array;
    }
}
