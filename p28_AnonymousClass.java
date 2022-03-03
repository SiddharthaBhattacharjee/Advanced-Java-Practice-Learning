package com.example;

interface demo{
    public void meth1();
    public void meth2();
}

class demoImp implements demo{ // class for normal class method

    @Override
    public void meth1() {
        System.out.println("Method 1 running...");
    }

    @Override
    public void meth2() {
        System.out.println("Method 2 running...");
    }
}

public class p28_AnonymousClass {
    public static void main(String[] args) {
        demoImp obj = new demoImp();
        obj.meth1(); // object instantiated using traditional class method.

        demo obj2 = new demo() { // anonymous class.
            @Override
            public void meth1() {
                System.out.println("Method 1 running...");
            }

            @Override
            public void meth2() {
                System.out.println("Method 2 running...");
            }
        };
        obj2.meth1(); // object instantiated using anonymous method, no need of making separate class for one time use.
    }
}
