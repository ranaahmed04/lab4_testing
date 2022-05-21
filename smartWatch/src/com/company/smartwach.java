package com.company;

import java.util.Scanner;

public class smartwach extends stub {
    public int seconds =0;
    public int minutes=0;
    public int hours =0;

    Scanner sc = new Scanner(System.in);
    int sec = sc.nextInt();

    Scanner sc1 = new Scanner(System.in);
    int min = sc1.nextInt();

    Scanner sc2 = new Scanner(System.in);
    int hour = sc2.nextInt();
    public String increamentsec(){
        seconds = seconds+1;
        boolean checkseconds= checkseconds(sec,min,hour);
        if(checkseconds==false){
            return"Time is: Hours :"+hours+"Minutes :"+minutes+"seconds :"+seconds;
        }
        else{
            seconds =0;
            return"Time is: Hours :"+hours+"Minutes :"+minutes+"seconds :"+seconds;
        }
    }

}
