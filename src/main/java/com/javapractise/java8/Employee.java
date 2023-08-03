package com.javapractise.java8;

public class Employee {
    int id;
    String name;
    String grade;
    double salary;
    String email;

    public Employee(int id, String name, String grade, double salary,String email) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.salary = salary;
        this.email=email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                '}';
    }
}
