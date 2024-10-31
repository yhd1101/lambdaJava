package com.exam;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx05 {
    public static void main(String[] args) {
        //map
        //원하는 필드 추출 / 특정 형태로 변환

        File file1 = new File("ext1.java");
        File file2 = new File("ext1.bak");
        File file3 = new File("ext3.java");
        File file4 = new File("ext3");
        File file5 = new File("ext1.txt");

        File[] fileArr = { file1,file2,file3,file4,file5};

        Stream<File> fileSTream = Stream.of(fileArr);
        //  fileSTream.map(File::getName).forEach(System.out::println);
        //확장자를 추출
        //조건 확장자 없는거는 제외
        //중복제거
        fileSTream.map(File:: getName)
                .filter(s -> s.indexOf('.') != -1)          //확장자가 없는 내용제외
                .peek(s -> System.out.println("peek: " +s)) //중간에 확인
                .map(s -> s.substring(s.indexOf('.')+ 1)) //확장자 추출
                .peek(s -> System.out.println("peek: " +s))
                .distinct()
                .forEach(System.out::println);
    }
}
