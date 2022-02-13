package com.example;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class p23_GrigorianCalenderClass {
    public static void main(String[] args) {
        GregorianCalendar c = new GregorianCalendar();
        //Leap Year checker using this class :
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter Year : ");
        a = scan.nextInt();
        if(c.isLeapYear(a)){
            System.out.println("Year "+a+" is a Leap Year");
        }
        else{
            System.out.println("Year "+a+" is NOT a Leap Year");
        }
    }
}
