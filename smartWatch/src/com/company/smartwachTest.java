package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class smartwachTest {
    @Test
    public void test1(){
        smartwach test= new smartwach();
        assertEquals("Time is : " + "Hours : " + 0 + " " + "Minutes : " + 0 + " " + "Seconds : " + 1,
                test.increamentsec() );
    }
    @Test
    // test when seconds reaches 60
    public void test2(){
        smartwach test= new smartwach();
        for(int i=0; i<59;i++){
            test.increamentsec();
        }
        assertEquals("Time is : " + "Hours : " + 0 + " " + "Minutes : " + 1 + " " + "Seconds : " + 0,
                test.increamentsec() );
    }
    @Test
    public void test3(){
        smartwach tester= new smartwach();
        for(int i=0; i<3599;i++)
        {
            tester.increamentsec();
        }
        assertEquals("Time is : " + "Hours : " + 1 + " " + "Minutes : " + 0 + " " + "Seconds : " + 0,
                tester.increamentsec() );
    }
}


