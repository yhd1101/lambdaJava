package com.exam;

public class LambdaEx07 {
    //함수

    public static void execute(LambdaInter7 f) {
        f.run();
    }
    public static void main(String[] args) {
        LambdaInter7 f  = () -> System.out.println("Hello Lam");
        execute(f);

        execute( () -> System.out.println("Hello Lam2"));

    }
}
