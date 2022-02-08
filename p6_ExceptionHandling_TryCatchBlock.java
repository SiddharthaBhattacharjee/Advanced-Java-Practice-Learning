package com.example;

import java.util.Scanner;

public class p6_ExceptionHandling_TryCatchBlock {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a numerator : ");
        a = scan.nextInt();
        System.out.printf("Enter a denominator : ");
        b = scan.nextInt();
        try{
            System.out.println("Division : "+a+"/"+b+" = "+a/b);
        }
        catch (Exception e){
            System.out.println("Error Occured : "+e);
            //if b is 0 , output is : Error Occurred : java.lang.ArithmeticException: / by zero
        }
    }
}
