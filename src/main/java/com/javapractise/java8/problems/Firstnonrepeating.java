package com.javapractise.java8.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/** To find first non repeat character from string */
public class Firstnonrepeating {

    public static void main(String args[]) {


        String str = "namburan";

        findNRC(str);
        //findNRCusingjava8(str);

        System.out.println("First non Repeating element from Array using java 8 >>>"+logic(str));

        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};

        Integer  result =
                Arrays.stream(arr)
                        .boxed()
                        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
                        .entrySet().stream()
                        .filter(entry -> entry.getValue() == 2L)
                        .map(entry -> entry.getKey())
                        .findFirst().get();

        System.out.println("First Repeating element from Array is "+result);

    }

    private static void findNRC(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            //if (!map.containsKey(str.charAt(i))) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i) , 0)+1);
            //}
        }

        //OptionalInt first = str.chars().filter(k -> map.get(k) == 1).findFirst();



        for (int j = 0; j < str.length(); j++) {
            if (map.containsKey(str.charAt(j))) {
                if (map.get(str.charAt(j)) == 1) {
                    System.out.println("First non repeating char is " + str.charAt(j));
                    break;
                }
            }
        }
    }

    private static Character logic(String input) {
        Character result =  input.chars()      // character stream
                .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i))) //convert to lowercase & then to Character object
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //store in a map with the count
                .entrySet().stream()  //entryset stream
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst().get();

        return result;
    }

//    private static int logicNum(String input) {
//        int result =  Stream.of(input)
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //store in a map with the count
//                .entrySet().stream()  //entryset stream
//                .filter(entry -> entry.getValue() == 1L)
//                .map(entry -> entry.getKey())
//                .findFirst().get();
//
//        return result;
//    }

    public static class SumArray {
        public static void main(String args[]){
            int arr[]={4,6,2,9,4,4,7};

            //Arrays.asList(4,6,2,9,4,4,7).stream().forEach(t-> System.out.println(t));

            Arrays.asList(4,6,2,9,4,4,7).stream().filter(t-> t%2==0).forEach(t-> System.out.println(t));

            System.out.println(SumArray(arr,0));
            System.out.println("sum : "+Arrays.stream(arr).sum());
        }

        public static int SumArray(int [] array,int index){
            if(index>array.length-1)
                return 0;
            else
            {
                return (array[index]+SumArray(array,index+1));
            }
        }
    }

    static class GreaterNumber {



        public static void main(String args[])
        {
           // int numarray[] = { 11, 13, 21, 3 };
            int numarray[] = { 11,2,4, 21, 3,4 };
            int n = numarray.length;
            nextGreaterNumber(numarray, n);
        }

        static void nextGreaterNumber(int numarray[], int n)
        {
            int nextNum, i, j;
            for (i = 0; i < n; i++) {
                nextNum = -1;
                for (j = i + 1; j < n; j++) {
                    if (numarray[i] < numarray[j]) {
                        nextNum = numarray[j];
                        break;
                    }
                }
                System.out.println(numarray[i] + " --> " + nextNum);
            }
        }
    }
}
