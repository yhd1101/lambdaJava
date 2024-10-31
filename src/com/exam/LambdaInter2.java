package com.exam;


//@FunctionalInterface 무조건 하나의 메서드ㄴ만 선언하게해주는거
//람다식을 사용하면 @FunctionalInterface 를 대부분 선언해줌 왜냐 메서드는 하나여야하니까.
@FunctionalInterface
public interface LambdaInter2 {
    //인터페이스안에 추상메서드가 2개인 경우.
    void method1();
//    void method2();
}
