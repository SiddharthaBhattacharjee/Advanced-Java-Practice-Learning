package com.example;

import java.util.Scanner;

public class p10_ThrowKeyword {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.printf("Enter a Numerator : ");
            a = scan.nextInt();
            System.out.printf("Enter a Denominator : ");
            b = scan.nextInt();
            if(b==0){
                throw new ArithmeticException("Division by Zero is illegal.");
            }
            else {
                System.out.println("Division : "+a+"/"+b+" = "+a/b);
            }
        }
        catch (Exception e){
            System.out.println("Input Exception : "+e);
            e.printStackTrace();
        }
    }
}
