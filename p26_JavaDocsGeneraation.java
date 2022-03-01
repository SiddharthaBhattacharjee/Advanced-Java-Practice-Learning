package com.example;

import java.util.Scanner;

/**
 * <i>This is a simple Class to see how class can be documented in Java Docs.</i>
 * @author Siddhartha Bhattacharjee
 * @version 1.0.0
 * */

class Emp{
    String name;
    int id;
    /** Constructor for employee objects
     * @return void
     * @param name Name of Employee -  String name
     * @param ID ID of Employee - Integer ID
     * */
    public Emp(String name, int ID){
        this.name = name;
        this.id = ID;
    }
    /** Getter for Name of Emp Object
     * @return String
     * */
    public String getName(){
        return this.name;
    }
    /** Getter for ID of Emp Object
     * @return Integer
     * */
    public int getID(){
        return this.id;
    }
    /** Method to print/display the object of Emp
     * @return Void
     * */
    public void show(){
        System.out.println("[ Name : "+this.name+" , ID : "+this.id+" ]");
    }
    /** Setter for Name of Emp Object
     * @return void
     * @param name Name of Employee -  String name
     * */
    public void setName(String name){
        this.name = name;
    }
    /** Setter for ID of Emp objects
     * @return void
     * @param ID ID of Employee - Integer ID
     * */
    public void setId(int ID){
        this.id = ID;
    }
}

/**
 * <i>This is a simple documentation to show that HTML elements can be included in JavaDoc.</i>
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html"> <b>Official</b> Java Docs </a>
 * @author Siddhartha Bhattacharjee
 * @version 1.0.0
 * */

public class p26_JavaDocsGeneraation {
    /** This method is used to return the divison of two numbers
     * @throws ArithmeticException if divided by 0
     * @return Integer
     * @param a First parameter -  Integer
     * @param b Second parameter - Integer
     * */
    public static int divison(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println("This is my main method");
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter numerator : ");
        int a = scan.nextInt();
        System.out.printf("Enter Denominator : ");
        int b = scan.nextInt();
        System.out.println("Division : "+a+"/"+b+" = "+divison(a,b));
    }
}
