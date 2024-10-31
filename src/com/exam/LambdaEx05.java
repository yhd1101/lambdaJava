package com.exam;

public class LambdaEx05 {
    public static void main(String[] args) {
        LambdaInter5 f = (int x, int y) -> {return x> y ? x: y;};

        f.method(10,20);
        System.out.println(f.method(10,20));

        f =(int x, int y) -> x> y ? x: y;
        System.out.println(f.method(20,10));

        f =(x,y) -> x>y ? x:y;
        System.out.println(f.method(40,50));
    }
}
