package com.example;

public class p19_DateTimeIntro {
    public static void main(String[] args) {
        System.out.printf("No of Miliseconds since the start of Time (1 Jan 1970) : ");
        System.out.println(System.currentTimeMillis());
        System.out.printf("No of Seconds since the start of Time (1 Jan 1970) : ");
        System.out.println(System.currentTimeMillis()/1000);
        System.out.printf("No of Minutes since the start of Time (1 Jan 1970) : ");
        System.out.println(System.currentTimeMillis()/1000/60);
        System.out.printf("No of Hours since the start of Time (1 Jan 1970) : ");
        System.out.println(System.currentTimeMillis()/1000/3600);
        System.out.printf("No of Days since the start of Time (1 Jan 1970) : ");
        System.out.println(System.currentTimeMillis()/1000/3600/24);
        System.out.printf("No of Years since the start of Time (1 Jan 1970) : ");
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        System.out.printf("No of Decades since the start of Time (1 Jan 1970) : ");
        System.out.println(System.currentTimeMillis()/1000/3600/24/365/10);
        System.out.println();
    }
}
