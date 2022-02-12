package com.example;

public class p20_Quizz_MillisInLongVars {
    public static void main(String[] args) {
        // Q : is it safe to store currentTimeMillis in a long variable?
        //A :
        System.out.printf("Max value of a Long is : ");
        System.out.println(Long.MAX_VALUE);
        System.out.printf("Current no. of milliseconds : ");
        System.out.println(System.currentTimeMillis());
        if(System.currentTimeMillis()>Long.MAX_VALUE){
            System.out.println("It is NOT safe to store currentTimeMillis in long variable");
        }
        else{
            System.out.println("It is SAFE to store currentTimeMillis in long variable");
        }
    }
}
