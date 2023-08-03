package com.javapractise.java8.problems;

public class Employee {
        private int id;
        private int department;
        private String name;
        private int age;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public int getDepartment() {
                return department;
        }

        public void setDepartment(int department) {
                this.department = department;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public Employee(int id, int department, String name, int age) {
                this.id = id;
                this.department = department;
                this.name = name;
                this.age = age;
        }
}
