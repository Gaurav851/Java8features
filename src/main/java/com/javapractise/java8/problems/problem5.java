package com.javapractise.java8.problems;

public class problem5 {

/*
You are given a license key represented as a string s that consists of only alphanumeric characters and dashes. The string is separated into n + 1 groups by n dashes. You are also given an integer k.
We want to reformat the string s such that each group contains exactly k characters, except for the first group, which could be shorter than k but still must contain at least one character. Furthermore, there must be a dash inserted between two groups, and you should convert all lowercase letters to
Input: s = "5F3Z-2e-9-w", k = 4
Output: "5F3Z-2E9W"
Explanation: The string s has been split into two parts, each part has 4 characters.
Note that the two extra dashes are not needed and can be removed.
Input: s = "2-5g-3-J", k = 2
Output: "2-5G-3J"
Explanation: The string s has been split into three parts, each part has 2 characters except the first part as it could be shorter as mentioned above.
 */

    public static void main(String[] args) {
        String input = "5F3Z-2e-9-w";
        int k = 4;

        System.out.println("Rearranged :"+rearrangeLicence(input, k,0));
        System.out.println("Rearranged :"+rearrangeLicence("2-5g-3-J", 2,0));
        //System.out.println("Rearranged :"+rearrangeLicence(input, k,0));


    }


    public static String rearrangeLicence(String token, int k,int counter) {

        if (token.length() == 1) {
            return token;
        } else {
            String s = new String();
            int lastCharIndex = token.length() - 1;
            String s1 = "";

            if (token.charAt(lastCharIndex) != '-') {
                s1 = token.charAt(lastCharIndex) + "";
                counter++;
            }
                if (counter == k) {
                    s1 = "-" + s1;
                    counter = 0;
                }


            return rearrangeLicence(token.substring(0, lastCharIndex--),k, counter) + s1;
        }
    }
}
