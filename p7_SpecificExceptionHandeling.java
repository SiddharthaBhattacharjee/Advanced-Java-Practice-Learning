package com.example;

import java.io.IOException;
import java.util.Scanner;

import static java.util.logging.Logger.global;

public class p7_SpecificExceptionHandeling {
    public static void main(String[] args) {
        int a,b;
        int arr[] = {0,1,2,3,4,5,6,7,8,9,10};
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a numerator between 0-10: ");
        a = scan.nextInt();
        System.out.printf("Enter a denominator between 0-10: ");
        b = scan.nextInt();
        // here error might occur in IO, problem solved with nested try catch in next problem.

        try{
            System.out.println("Division : "+arr[a]+"/"+arr[b]+" = "+arr[a]/arr[b]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmatic Error Occured : "+e);
            //if b is 0 , output is : Error Occurred : java.lang.ArithmeticException: / by zero
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Too big number detected : "+e);
        }
        catch (Exception e){
            System.out.println("Unknown Error Occured : "+e);
        }
    }
}
