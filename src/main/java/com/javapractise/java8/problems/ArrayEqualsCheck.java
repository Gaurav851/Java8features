package com.javapractise.java8.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayEqualsCheck {

    public static void main(String args[]){
        String[] values = { "123", "Abb", "aab" };
        Arrays.sort(values, (a,b)->b.toLowerCase().compareTo(a.toLowerCase()));
        for (String s: values)
            System.out.print(s + " ");


        int arr1[] = {21,6,8,9,10,5};

        int arr2[] = {10,21,5,8,6,9};

        System.out.println("IS Array Same:"+ArrayCheck(arr1,arr2));

         /*   HashMap<Integer,Integer> Map=Stream.of(arr1)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));*/


       /* HashMap<Integer,Integer> Map=Arrays.stream(arr1)
                .boxed()
                .collect(Collectors.groupingBy(Integer::intValue,Collectors.counting())))
               // .forEach((k, v) -> System.out.println(k+" "+v.size()));*/


        Map<Integer,Long> occurrencesMap =
                Arrays.stream(arr1)
                        .boxed()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

       // occurrencesMap.forEach((k,v)->{System.out.println(k+" = "+v);});


        }

    private static boolean ArrayCheck(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length)
            return false;

        Map<Integer, Integer> Map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (Map.containsKey(arr1[i]))
                Map.put(arr1[i], Map.get(arr2[i] + 1));
            else
                Map.put(arr1[i], 1);
        }


        for (int i = 0; i < arr2.length; i++) {
            if (Map.containsKey(arr2[i])) {
                int val=Map.get(arr2[i])-1;
                if (val == 0)
                    Map.remove(arr2[i]);
                else
                    Map.put(arr2[i], val);
            } else
                return false;
        }

        if (Map.isEmpty())
            return true;
        return false;
    }

}
