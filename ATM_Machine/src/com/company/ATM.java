package com.company;

public class ATM {

    public int takemoney(int value){
        ATM1 atm = new ATM1();
        String tmam = atm.checking(value);
        if(tmam=="Transaction Accepted")
        {
            int NewBalance = atm.amount - value ;
            System.out.println(" you have take "+value);
            System.out.println(" your new balance is "+NewBalance);
            return 1;

        }
        else{
            System.out.println(" your balnace is not enough to do this transaction  ");
            return 0;
        }
    }
}
