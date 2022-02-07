package com.example;

//Statement : Demonstrate gerPriority() and setPriority() methods in Java threads.

class Thread3 extends Thread {
    public Thread3(String name){
        super(name);
    }
    public void run() {
        int x=0;
        while (x<100) {
            System.out.println("Hello World, I am : "+this.getName());
            x++;
        }
    }
}

public class PS1_Q3 {
    public static void main(String[] args) {
        Thread3 t1 = new Thread3("Thread 1");
        Thread3 t2 = new Thread3("Thread 2");
        t1.setPriority(10);
        t2.setPriority(1);
        t1.start();
        t2.start();
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
