package com.exam;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerEx01 {
    public static void main(String[] args) {
        //매개변수를 받아서 Return x
        //String형변환 제네릭
        //Consumer<T> void accept(T t) 매개 변수를 사용만 하고 리턴을 하지 않는 함수 형태로 이용 매개변수 o 반환 x
        Consumer<String > c1 =  t -> System.out.println("매개변수 : " + t);
        c1.accept("홍길동");

        BiConsumer<String, Integer> c2 =(a,b) -> System.out.println(a +"/ " +b);
        c2.accept("홍길동", 10);

        //특정 자료향
        // xxxConsumer
        IntConsumer c3 = a-> System.out.println(a);
        c3.accept(10);
    }
}
