package com.example;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "Error : Entered number less than or equal to 9";
    }
    @Override
    public String getMessage(){
        return "Message : Enter a number which is greater than 9 i.e. [10,inf)";
    }
}

public class p9_CustomExceptionsUsingClass {
    public static void main(String[] args){
        int a;
        System.out.printf("Enter a number greater than 9 : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<10){
            try{
                throw new MyException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Ended");
            }
        }
    }
}
