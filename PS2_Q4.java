package com.example;

import java.util.Scanner;

class MyError extends Exception{
    @Override
    public String toString(){
        return "Error : Max tries reached : Array Index out of range";
    }
    @Override
    public String getMessage(){
        return "Message : choose a number between 0-2";
    }
}

public class PS2_Q4 {
    public static void main(String[] args) throws MyError {
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner Sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i<5){
            try {
                System.out.printf("Enter the value of index : ");
                index = Sc.nextInt();
                System.out.println("The value of marks[index] is : " + marks[index]);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=5){
            throw new MyError();
        }
    }
}
