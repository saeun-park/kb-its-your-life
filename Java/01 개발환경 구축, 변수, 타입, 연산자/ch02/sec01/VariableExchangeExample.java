package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int x = 3;
        int y = 5;

        // 초기 값 출력
        System.out.println("x: " + x + ", y: " + y);

        // x와 y의 값 교환
        int temp = x;
        x = y;
        y = temp;

        // 교환 후 값 출력
        System.out.println("x: " + x + ", y: " + y);
    }
}
