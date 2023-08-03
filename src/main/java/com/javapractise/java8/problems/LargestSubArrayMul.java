package com.javapractise.java8.problems;

import java.util.Arrays;
import java.util.List;

/**
 *
 * Given an integer array, find a subarray that has the largest product and return the product.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,-2,4]
 * Output: 6
 *
 * Explanation: [2,3] has the largest product 6.
 *
 * Example 2:
 *
 * Input: nums = [-2,0,-1]
 *
 * Output: 0
 *
 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 */
public class LargestSubArrayMul {

    public static void main(String[] args) {

    int num[]={2,3,-2,4};
        findSubArray(num,0,0);

       // List<Integer> myList = Arrays.asList(2,3,-2,4);
       // pairwithLargestProduct(myList);
    }

    private static void findSubArray(int[] num,int i,int j) {

        int max= Integer.MIN_VALUE;
        while(i<j && j<num.length){
           // findprod(a);
        }

    }

    private static void pairwithLargestProduct(List<Integer> myList) {

    }

}
