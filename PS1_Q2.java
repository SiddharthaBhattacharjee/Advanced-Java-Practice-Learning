package com.example;

//Statement : Add a step method in the welcome thread of question 1 to delay its execution for 200ms.

class Thread11 extends Thread{
    public void run(){
        while (true){
            System.out.println("Welcome");
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }

        }
    }
}
class Thread12 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good morning");
        }
    }
}

public class PS1_Q2 {
    public static void main(String[] args) {
        Thread1 t1= new Thread1();
        Thread2 t2= new Thread2();
        t1.start();
        t2.start();
    }
}
