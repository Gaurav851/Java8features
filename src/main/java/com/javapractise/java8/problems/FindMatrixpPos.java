package com.javapractise.java8.problems;

public class FindMatrixpPos {

    public static void main(String args[]){


        int mat[][] = new int [][]{ {10, 20, 30, 40,52},
                {15, 25, 35, 45,53},
                {27, 29, 37, 48,54},
                {32, 33, 39, 50,58}
                };

        int x = 29;
        boolean found=false;
        for(int i=0;i<mat.length;i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (x == mat[i][j]) {
                    System.out.println("Found at " + i + "," + j);
                    found = true;
                    break;
                }
            }
        }
            if(!found)
                System.out.println("Not found!");

    }
}
