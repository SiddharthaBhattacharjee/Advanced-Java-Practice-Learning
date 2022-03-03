package com.example;

@FunctionalInterface
interface sumession{
    public int sumession(int[] arr);
}

class sum{
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}

class CustomSum extends sum implements sumession{
    @SuppressWarnings(" deprecation ")
    @Override
    public int sum(int a, int b) {
        return (a*10+b*10)/10;
    }
    @Override
    public int sumession(int[] arr){
        int sm = 0;
        for(int i:arr){
            sm += i;
        }
        return sm;
    }
}

public class p27_Anotations {
    public static void main(String[] args) {
        sum s = new sum();
        System.out.println(s.sum(11,12));
        CustomSum s1 = new CustomSum();
        System.out.println(s1.sum(11,12));
        System.out.println(s1.sumession(new int[] {2,4,5,7,8,19}));
    }
}
