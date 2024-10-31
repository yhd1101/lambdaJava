package com.exam;

public class LambdaEx01 {
    public static void main(String[] args) {

        //익명 클래스
        new LambdaInter1() {
            @Override
            public void method() {
                System.out.println("Hello Lambda");
            }
        }.method();

        //이름 두번째 방식 => 람다형식으로 바꿀수있다. lambda
        LambdaInter1 f = new LambdaInter1() {
            @Override
            public void method() {
                System.out.println("Hello Lamdaa2");
            }
        };
        f.method();

        //lamda 형식
        //()이거는 method()를 뜻함
        f = () -> {
            System.out.println("Hello lamda3");
        };
        f.method();

        //더 생략 할수도있음.{} 생략
        //lambda 변경하는 메서드 내용은 간단해야함. 복잡하면 보기힘들수도있음.
        f = () -> System.out.println("Hello Lambda4");
        f.method();
    }
}
