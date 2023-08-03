package com.javapractise.java8.problems;


import java.util.Arrays;

/**
 *  Given two sorted arrays, the task is to merge them in a sorted manner.
 */
public class MergeSortedArrays {

    public static void main(String args[]){

        int arr1[] = {1, 3, 4, 5};
        int arr2[] = {2, 4, 6, 8};

         // arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}
        int arr3[]=mergeSortedArray(arr1,arr2);
        Arrays.stream(arr3).forEach(System.out::println);

        //Arrays.stream(arr1).collect(Collectors.joining(arr2))


    }

    private static int[] mergeSortedArray(int[] a, int[] b) {


        int arr3[]= new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                arr3[k++]=a[i];
                i++;
            }else if(a[i]>b[j]){
                arr3[k++]=b[j];
                j++;
            }else{
                arr3[k++]=a[i];
                i++;
                arr3[k++]=b[j];
                j++;
            }
        }
        while(i<a.length)
            arr3[k++]=a[i++];
        while(j<b.length)
            arr3[k++]=b[j++];

        return arr3;
    }

    public static class BinarySearch {

        public static void main(String args[]){
            int arr[] = {11, 23, 32, 52, 76, 81, 111, 135, 140, 170};
            int key=11;
            System.out.println("Key is present at"+findKey(arr,key));


        }

        private static int findKey(int[] arr, int key) {
            int start=0;
            int end= arr.length-1;
            int mid;
            while(start<=end){
                mid= (end+start)/2;
                if(key==arr[mid])
                    return mid+1;
                else if(key<arr[mid]){
                    end=mid-1;
                }
                else
                    start=mid+1;
            }
            return -1;
        }
    }
}
