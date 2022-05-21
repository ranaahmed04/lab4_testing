package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    @Test
    public void test1 (){
        ATM test1 = new ATM();
        assertEquals(1,test1.takemoney(1000));
    }
    @Test
    public void test2(){
        ATM test2 = new ATM();
        assertEquals(1,test2.takemoney(10000));
    }
    @Test
    public void test3 (){
        ATM test3 = new ATM();
        assertEquals(0,test3.takemoney(150000));
    }

}