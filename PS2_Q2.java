package com.example;

//statement :  Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.

public class PS2_Q2 {
    public static void main(String[] args) {
        try{
            int a = 156/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }
    }
}
