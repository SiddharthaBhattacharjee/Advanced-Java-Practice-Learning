package com.example;

import java.util.Scanner;

public class p11_ThrowsVsThrow {

    public static double devide(double a,double b) throws ArithmeticException{
        double c = a/b;
        return c;
    }

    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a Numerator : ");
        a = scan.nextInt();
        System.out.printf("Enter a Denominator : ");
        b = scan.nextInt();
        System.out.println("Division : "+a+"/"+b+" = "+devide(a,b));
    }
}
