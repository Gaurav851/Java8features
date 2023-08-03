package com.javapractise.java8.problems;

public class ReverseStringWithSpecial {

    public static void main(String[] args) {

        String s="ani&ma%lofhe*av$en";

        System.out.println("After Reverse :" +reverseSpecial(s));
    }

    private static String reverseSpecial(String s) {

        int i=0,j=s.length()-1;

        char arr[]= s.toCharArray();
        while(i<j) {
            if (!Character.isAlphabetic(arr[i]))
                i++;
            if (!Character.isAlphabetic(arr[j]))
                j--;

            if (Character.isAlphabetic(arr[j]) && Character.isAlphabetic(arr[i])) {
                char tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
            return new String(arr);
        }
}
