package com.javapractise.java8.problems;

import java.util.Arrays;

public class Diffproblem {

    public static void main(String args[]) {

        int A[] = {1, 3, 15, 11, 2};
        int B[] = {23, 127, 235, 19, 8,12};

        System.out.println("Min diff1 :" + findmindiff1(A, B));
    }

    private static int findmindiff1(int[] a, int[] b) {

        Arrays.sort(a);
        Arrays.sort(b);

        int i=0,j=0,diff=Integer.MAX_VALUE;

        while(i<a.length && j<b.length){

            if(Math.abs(a[i]-b[j])<diff){
                diff=Math.abs(a[i]-b[j]);
                System.out.println("first "+a[i] +" "+b[j]+" Diff:"+diff);
            }
            if(a[i]<b[j]){
                i++;
            }
            else
                j++;
        }
        return diff;
    }

    private static int findmindiff(int[] a, int[] b) {

        int diff =0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i]-b[j]>0 && diff==0){
                    diff=a[i]-b[j];
                    //System.out.println("first "+a[i] +" "+b[j]+" Diff:"+diff);
                }
                if ((a[i] - b[j] < diff) && a[i]-b[j]>0) {
                    diff=a[i] - b[j];
                    //System.out.println("second:"+a[i] +" "+b[j]+" Diff:"+diff);
                    break;
                }
            }
        }
        return diff;
    }

    public static class Vowel {

        public static void main(String args[])
        {
            String input="The quick brown fox jumps right over the little lazy dog.";
            String word[] = input.split(" ");

            highestVowel(word, word.length);
        }

        static void highestVowel(String word[], int n)
        {
            int largestCount=-99;
            String vowelWord=word[0];
            for (int i = 0; i < n; i++) {
                int count = countVowels(word[i]);
                if (largestCount < count) {
                    largestCount = count;
                    vowelWord = word[i];
                }
            }
                System.out.println("Word with largest vowel count is " +vowelWord+" count --> " + largestCount);
            }

        static boolean isVowel(char ch)
        {
            ch = Character.toUpperCase(ch);
            return (ch=='A' || ch=='E' || ch=='I' ||
                    ch=='O' || ch=='U');
        }

        static int countVowels(String str)
        {
            int count = 0;
            for (int i = 0; i < str.length(); i++)
                if (isVowel(str.charAt(i))) // Check for vowel
                    ++count;
            System.out.println(str+" ->:"+count);
            return count;
        }
    }
}
