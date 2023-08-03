package com.javapractise.java8.problems;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {

    public static void main(String args[]){

        Map<Character,Integer> romanMap= new HashMap<>();
        loadMap(romanMap);
        String romanNum= "LVIII"; //"XXVII";
        getNumberfromRoman(romanMap,romanNum);
        getNumberfromRomanUsingJava8(romanMap,romanNum);
    }

    private static void getNumberfromRomanUsingJava8(Map<Character, Integer> romanMap, String romanNum) {

        Integer num1=  romanNum.codePoints().mapToObj(c -> (char)c)
                .map( s-> romanMap.get(s))
                .mapToInt(m->m)
                .reduce(0,(a,b)-> a+b);

        System.out.println("Number for using java 8"+romanNum+ " is >> "+num1);
    }

    private static void getNumberfromRoman(Map<Character, Integer> romanMap, String romanNum) {
        int num=0;
        for(int i=0;i<romanNum.length();i++){
            if(romanMap.containsKey(romanNum.charAt(i))){
                num+=romanMap.get(romanNum.charAt(i));
            }
        }



        System.out.println("Number for "+romanNum+ " is >> "+num);
    }

    private static Map<Character, Integer> loadMap(Map<Character, Integer> romanMap) {

        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
        return romanMap;
    }
}
