package com.exam;

public class LambdaEx03 {
    public static void main(String[] args) {
        //인자가있을시
//        LambdaInter3 f = (int x) -> {
//            System.out.println("method 호출: " + x);
//        };
//
//        f = x -> System.out.println("method 호출: " + x);
//
//        f.method(10);

        //인자가 두개일시
        LambdaInter3 f = (x,y) ->System.out.println("method 호출: " + x+" : "+y);
        f.method(10,20);


    }
}
