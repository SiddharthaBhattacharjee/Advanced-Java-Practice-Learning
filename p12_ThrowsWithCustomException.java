package com.example;

import java.util.Scanner;

class AreaException extends Exception{
    @Override
    public String toString(){
        return "Error : Length cannot be negative, area cannot be calculated";
    }
    @Override
    public String getMessage(){
        return "Message : Make a modulus function to ensure all inputs are positive";
    }
};

public class p12_ThrowsWithCustomException {
    public static double CircleArea(int r) throws AreaException{
        if(r<0){
            throw new AreaException();
        }
        double arr = 3.1415 * r * r;
        return arr;
    }
    public static void main(String[] args) {
        int r;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Radius : ");
        r = scanner.nextInt();
        // Now if we don't put try catch, it will not compile because of throws, we need to handle the exception in throws.
        try{
            System.out.println("Area of circle is : "+CircleArea(r));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
