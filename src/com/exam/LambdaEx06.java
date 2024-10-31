package com.exam;

public class LambdaEx06 {
    public static void main(String[] args) {
        LambdaInter6 f = (int[] arr) -> {
            int sum = 0;
            for (int i : arr) {
                sum = sum+i;
            }
            return sum;
        };
        int []arr = {1,2};

        System.out.println(f.sumArr(arr));


    }
}
