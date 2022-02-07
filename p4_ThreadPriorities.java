package com.example;

class myThr1 extends Thread{
    public myThr1(String name){
        super(name);
    }
    @Override
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Thread Started... "+this.getName().toString());
            i++;
        }
    }
}

public class p4_ThreadPriorities {
    public static void main(String[] args) {
        myThr1 thr1 = new myThr1("Thread Number 1");
        myThr1 thr2 = new myThr1("Thread Number 2 (Least Important)");
        myThr1 thr3 = new myThr1("Thread Number 3");
        myThr1 thr4 = new myThr1("Thread Number 4 (Most Important)");
        myThr1 thr5 = new myThr1("Thread Number 5");
        thr4.setPriority(Thread.MAX_PRIORITY);
        thr2.setPriority(Thread.MIN_PRIORITY);
        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        thr5.start();
    }
}
