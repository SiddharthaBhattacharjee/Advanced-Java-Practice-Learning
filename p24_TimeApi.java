package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class p24_TimeApi {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println("Local date now is : "+ld);

        LocalTime lt = LocalTime.now();
        System.out.println("Local Time now is : "+lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Local DateTime now is : "+ldt);
    }
}
