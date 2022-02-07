package com.example;

class myThr2 extends Thread{
    public myThr2(String name){
        super(name);
    }
    @Override
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("Thread Started... "+this.getName().toString());
            i++;
        }
    }
}

public class p5_ThreadMethods {
    public static void main(String[] args) {
        myThr2 t1 = new myThr2("Thread 1");
        myThr2 t2 = new myThr2("Thread 2");
        t1.start();
        try{
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
