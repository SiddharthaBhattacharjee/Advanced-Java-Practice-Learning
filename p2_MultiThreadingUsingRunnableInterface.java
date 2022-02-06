package com.example;

class MyThreadRunable implements Runnable{
    public void run(){
        int x = 0;
        while (x<1000000){
            System.out.println("Running Thread 1");
            x++;
        }

    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int y = 0;
        while(y<1000000){
            System.out.println("Running Thread 2");
            y++;
        }

    }
}
public class p2_MultiThreadingUsingRunnableInterface {
    public static void main(String[] args) {
        MyThreadRunable bullet1 = new MyThreadRunable();
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        //Runnable interface classes are like bullets,we need gun to shoot the bullets
        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);
        //now gun is loaded, we can shoot
        gun1.start();
        gun2.start();
    }
}
