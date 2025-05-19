package ch06.sec10.exam01;

import static ch06.sec10.exam01.Calculator.*;

public class CalculatorExample {
    public static void main(String[] args) {
        double result1 = 10 * 10 * pi;
// 원의 넓이
        int result2 = plus(10,5); // 10, 5의 합
        int result3 = minus(10,5); // 10, 5의 차
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
    }
}