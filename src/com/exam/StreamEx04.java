package com.exam;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx04 {
    public static void main(String[] args) {
        Stream<String> strStream = Stream.of("b","cc","D","C","AA","F");

        //오름차순 정렬
      //  strStream.sorted().forEach(System.out::println);

        //compareTo <- comparable 인터페이스
        //비교방법은 정의
        //비교 방법을 기술
        //(s1, s2) -> s2.compareTo(s1)

        //내림차순
   //     strStream.sorted((s1, s2) -> s2.compareTo(s1)).forEach(System.out::println);
        //strStream.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //대소문자 구별없이
        strStream.sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);
    }
}
