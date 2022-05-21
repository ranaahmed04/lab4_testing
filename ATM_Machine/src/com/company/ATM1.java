package com.company;

public class ATM1 {
    public int amount = 50000;
    public String checking(int value){
        if (amount>value)
            return "Transaction Accepted";
        else
            return " Rejected transection ";
    }
}
