package ch04.exam_adv;

public class Triangle2 {
    public static void main(String[] args) {
        for(int i = 5; i >= 1; i--) {           // i를 5부터 1까지 줄여가며
            for(int j = 1; j <= i; j++) {       // i개만큼 * 출력
                System.out.print("*");
            }
            System.out.println();               // 줄바꿈
        }
    }
}

