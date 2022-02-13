package com.example;

import java.util.Date;

public class p21_DateClass {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.printf("Date d initial value : ");
        System.out.println(d);
        System.out.println("No. of milliseconds since 1st Jan 1970 : "+d.getTime());
        // All these methods are depricated i.e. outdated.
        System.out.println("Todays Date : "+d.getDate());
        System.out.println("Current Month : "+d.getMonth());
        System.out.println("No. of years since 1900 : "+d.getYear());
        System.out.println("Current Year  : "+(d.getYear()+1900));
    }
}
