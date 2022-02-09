package com.example;

import java.util.Scanner;

public class p13_FinallyBlock {
    public static int ModFlorDivide(int a,int b) {
        try{
            int c = a/b;
            if(c<0){
                c = -c;
            }
            return c;
        }
        catch(Exception e){
            System.out.println(e);
            return -1;
        }
        finally {
            System.out.println("No matter where the function returns, this part will always run :) ");
        }
    }

    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a Numerator : ");
        a = scan.nextInt();
        System.out.printf("Enter a Denominator : ");
        b = scan.nextInt();
        System.out.println("Division : "+a+"/"+b+" = "+ModFlorDivide(a,b));
    }
}
