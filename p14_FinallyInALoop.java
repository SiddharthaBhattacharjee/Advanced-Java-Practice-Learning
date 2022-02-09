package com.example;

public class p14_FinallyInALoop {
    public static void main(String[] args) {
        int a=100;
        int b=10;
        while(true){
            try{
                System.out.println("Dicision : "+a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("For B = "+b);
                //Executes even if the loop is breaked.
            }
            b--;
        }
    }
}
