package com.javapractise.java8.problems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StreamsTest {
    public static void main(String[] args) {
        StreamsTest streamsTest = new StreamsTest();
        streamsTest.solution();
    }





    private void solution() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("AAA",111,"D1",1000));
        employees.add(new Employee("BBB",222,null,2000));
        employees.add(new Employee("CCC",333,"D2",3000));
        employees.add(new Employee("DDD",444,"D3",4000));
        employees.add(new Employee("EEE",555,"D2",5000));
        employees.add(new Employee("FFF",666,"D2",6000));

        //System.out.println(employees);
        //TODO print employee names belongs to dept "D2" -  using streams functions
        System.out.println(">>>>Employees with dept D2:");
        employees.stream()
                .filter(e ->e.getDeptno()=="D2")
                .map(e-> e.getName())
                .forEach(System.out::println);

       /* employees.stream()
                .collect(Collectors.groupingBy(Employee::getDeptno,HashMap::new,Collectors.counting()))
                .forEach((k,v)-> System.out.println(k+":"+v));*/





        //TODO Print the sum of all employees salaries using streams -  expected to print 21000
        int reduce = employees.stream()
                .mapToInt(Employee::getSalary)
                .sum();

        System.out.println("Salary Sum "+reduce);
        //





        //TODO Given a sentence find the word that has the highest length using Streams. expected to print "Welcome"
        String  input = " Welcome to Java world";


        String s =
                Arrays.stream(input.split(" "))
                .max(Comparator.comparingInt(String::length)).get();
        System.out.println("Max length:"+s);


        //TODO Should print most repeated number from the array, using streams or Java 7 features...
        // number 5 repeated most of the (3)times, Should print 5 and not 3
        int arr[] = {5, 7, 5, 7, 5, 2};

        //Arrays.stream(arr)
          //      .collect(Collectors.groupingBy(Function.identity(), TreeMap::new,Collectors.counting()))
          Map<Integer,Integer> map= new TreeMap<>();

          map.put(5,3);
          map.put(7,2);
          map.put(2,1);

          int max=Integer.MIN_VALUE;
           int val=0;
          for(Map.Entry entry: map.entrySet()){
              if(max<(int)entry.getValue()){
                  max=(int)entry.getValue();
                  val=(int)entry.getKey();
              }
          }
          System.out.println("max key value :"+val);









        //Optional example
        if(employees==null){
            throw new RuntimeException();
        }else{
            processEmp(employees);
        }

    }
    private void processEmp(List<Employee> employees) {



    }
    private class Employee {

        private String name;
        private int id;
        private String deptno;
        private int salary;
        private List<String> addresses;



        public Employee(String name, int id, String deptno, int salary) {
            this.name = name;
            this.id = id;
            this.deptno = deptno;
            this.salary = salary;
        }



        @Override
        public String toString() {
            return name + "::" + id + "::" + deptno + "::" + salary;
        }
        public String getName() {
            return name;
        }
        public int getId() {
            return id;
        }
        public String getDeptno() {
            return deptno;
        }
        public int getSalary() {
            return salary;
        }
    }
}
