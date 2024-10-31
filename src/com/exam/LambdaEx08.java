package com.exam;

public class LambdaEx08 {
    public static LambdaInter8 getLambdaIter8 () {
        LambdaInter8 f = () -> System.out.println("Hello Lam");
        return  f;
    }
    public static void main(String[] args) {
        LambdaInter8 f = getLambdaIter8();
        f.run();
    }
}
