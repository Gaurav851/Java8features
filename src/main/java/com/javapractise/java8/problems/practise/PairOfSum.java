package com.javapractise.java8.problems.practise;

public class PairOfSum {

    public static void main(String[] args) {
        int sum=70;
        int a[]={10, 19, 35, 50, 75, 80};
       // findPairOfNumberSum(a,sum,a.length);
        int a1[]={15, 19, 35, 50, 75, 80};
        int a2[]={1, 12, 20, 30, 76, 90};
        int sum1=70;
        findPairFromTwoArrays(a1,a2,sum1);
    }

    private static void findPairFromTwoArrays(int[] a1, int[] a2, int sum) {

        int i=0,j=a2.length-1;

        while(i< a1.length && j>=0){
            if(a1[i]+a2[j]==sum){
                System.out.println("index of pairs who sum is equals to "+sum+  " is "+i+" and "+j);
                break;
            }else if(a1[i]+a2[j]<sum){
                i++;
            }else{
                j--;
            }
        }

    }

    private static void findPairOfNumberSum(int[] a,int target, int length) {

        int i=0,j=length-1;

        while(i<j){
            if(a[i]+a[j]>target){
                j--;
            }
            else if(a[i]+a[j]<target){
                i++;
            }else{
                if(a[i]+a[j]==target)
                    System.out.println("index of pairs who sum is equals to "+target+  " is "+i+" and "+j);
                else
                    System.out.println("pair not found");
                break;
            }
        }
    }


}
