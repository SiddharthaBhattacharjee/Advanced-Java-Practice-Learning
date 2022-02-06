package com.example;

class myThr extends Thread{
    public myThr(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("Thread Started...");
    }
}

public class p3_ThreadConstructor {
    public static void main(String[] args) {
        myThr thr = new myThr("First Thread");
        thr.start();
        System.out.println("Id of thread is : "+thr.getId());
        System.out.println("Name of thread is : "+thr.getName());
    }
}
