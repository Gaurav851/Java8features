package com.javapractise.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Transaction {
        double amount;
        String currency;
        // constructor and other methods


    public Transaction(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public static List<Transaction> getAllTransactions(){

        return Stream.of(
                new Transaction(20.0,"INR"),
                new Transaction(30.0,"USG"),
                new Transaction(40.0,"INR"),
                new Transaction(10.0,"AUD"),
                new Transaction(200.0,"INR"),
                new Transaction(13.0,"CAD"),
                new Transaction(21.0,"AUD"),
                new Transaction(20.0,"USD")
        ).collect(Collectors.toList());
    }
}



