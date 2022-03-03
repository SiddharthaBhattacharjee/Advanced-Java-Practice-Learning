package com.example;

@FunctionalInterface
interface Square{
    public int sq(int i);
}

@FunctionalInterface
interface Greeter{
    public void greet();
}

@FunctionalInterface
interface caller{
    public void call (int PhnNo);
}

public class p29_LambdaExpression {
    public static void main(String[] args) {
        Square sqr = (i->i*i);
        System.out.println(sqr.sq(4));

        Greeter g = ()->{ System.out.println("Hello There :)"); };
        g.greet();

        caller c = (a)->{ System.out.println("calling +91-"+a+" ..."); };
        c.call(240863);
    }
}
