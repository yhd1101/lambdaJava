package com.exam;

public class LambdaEx02 {
    public static void main(String[] args) {
        LambdaInter2 f = new LambdaInter2() {
            @Override
            public void method1() {
                System.out.println("method1 호출");
            }

//            @Override
//            public void method2() {
//                System.out.println("method2 호출");
//            }
        };

        f.method1();
//        f.method2();

        //람다식으로 변경lambda
        //에러 이유 : 인터페이스안에 메서드가 2개이상이면 람다식 변경이 불가. 메서드가 두개일씨.
        //무조건 인터페이스당 메서드 하나여야함.
        f = () -> {
            System.out.println("method1 호출");
        };


    }
}
