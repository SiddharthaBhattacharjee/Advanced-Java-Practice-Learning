package com.example;

import java.util.Scanner;

public class p8_NestedTryCatch {
    public static void main(String[] args) {
        int a,b;
        int arr[] = {0,1,2,3,4,5,6,7,8,9,10};
        Scanner scan = new Scanner(System.in);
        try{
            System.out.printf("Enter a numerator between 0-10: ");
            a = scan.nextInt();
            System.out.printf("Enter a denominator between 0-10: ");
            b = scan.nextInt();

            try{
                System.out.println("Division : "+arr[a]+"/"+arr[b]+" = "+arr[a]/arr[b]);
            }
            catch (Exception e){
                System.out.println("Unknown Error Occured : "+e);
            }
        }
        catch (Exception e){
            System.out.println("Unknown Exception Occured : "+e);
        }

    }
}
