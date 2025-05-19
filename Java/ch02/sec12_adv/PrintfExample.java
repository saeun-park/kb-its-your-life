package ch02.sec12_adv;

public class PrintfExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품의 가격: %d원\n", value);
        System.out.printf("상품의 가격: %6d원\n", value);
        System.out.printf("상품의 가격: %-6d원\n", value);
        System.out.printf("상품의 가격: %06d원\n", value);
        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이: %.2f\n", 10, area);
        String name = "홍길동";
        String job = "도적";
        System.out.printf(" %-6d | %-6s | %-6s\n", 1, name, job);
    }
}

//포맷   설명
//%d	정수 출력
//%6d	6자리 확보, 오른쪽 정렬
//%-6d	6자리 확보, 왼쪽 정렬
//%06d	6자리 확보, 빈 자리는 0으로 채움
//%.2f	실수 소수점 아래 2자리까지 출력
//%-6s	문자열 6자리 확보, 왼쪽 정렬
