package com.exam;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx01 {
    public static void main(String[] args) {
        //데이터생성
        String[] nameArr = {"IronMan", "Captain", "SpiderMan","Thor"};

        //정렬
        //데이터처리
        Arrays.sort(nameArr);

        //데이터출력
//        for (String name: nameArr) {
//            System.out.println(name);
//        }
        //Stream화시키기
        //Stream 생성 리
        Stream<String> nameStream = Arrays.stream(nameArr);
        //Stream 처리
        //Stream 출력
        //출력과 처리 동시처리
        nameStream.sorted().forEach(System.out::println);

    }
}
