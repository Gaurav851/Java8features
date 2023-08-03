package com.javapractise.java8.incubation26jul;

import java.util.Arrays;

public class DuplicateRemoval {

    public static void main(String[] args) {
        // Remove duplicates from string and return in same order".
        //
        //	String s = "dabfcadef"; -> dabfce

        String s = "dabfcadef";

        Arrays.stream(s.split(""))
                .distinct().forEach(System.out::print);

    }
}
