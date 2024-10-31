package com.exam;

public class LambdaEx04 {
    public static void main(String[] args) {
        //return 생략가능
        LambdaInter4 f = (x, y) -> {return  x + y;};
        f = (x,y) -> x+y;
        System.out.println(f.method(10,20));
    }
}
