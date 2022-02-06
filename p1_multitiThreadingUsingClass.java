package com.example;

class MyThread extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<40000){
            System.out.println("My Thread is Running");
            System.out.println("I am Happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int j=0;
        while (j<40000){
            System.out.println("My Thread2 is Running");
            System.out.println("I am too Happy!");
            j++;
        }
    }
}

public class p1_multitiThreadingUsingClass {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread2 myThread2 = new MyThread2();
        myThread.start();
        myThread2.start();
    }
}
