package com.exam;

import java.util.stream.IntStream;

public class StreamEx03 {
    public static void main(String[] args) {
        //1~10숫자
        //IntStream test1 = IntStream.of(1,2,3,4,5);

        //무작이로ㅓ넣기숫자ㄴ
        IntStream test1 = IntStream.rangeClosed(1,10);
        //test1.forEach(System.out::println);
        //filter 거르다
        //짝수이면 forEach를찍어라
    //    test1.filter( i -> i %2 ==0).forEach(System.out::println);
        
        IntStream test2 = IntStream.of(1,2,3,3,2,5,7,6,9);
        //중복제거
        test2.distinct().forEach(System.out::println);
    }
}
