package com.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class p25_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Time from LocalDateTime is : "+ldt);

        DateTimeFormatter datef = DateTimeFormatter.ofPattern("dd/mm/yyyy , E");
        DateTimeFormatter timef = DateTimeFormatter.ofPattern("hh:mm a");

        String myDate = ldt.format(datef);
        String myTime = ldt.format(timef);

        System.out.println("Formatted Date : "+myDate);
        System.out.println("Formatted Time : "+myTime);

    }
}
