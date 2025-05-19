package ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {

        // 시작 시간 측정 (나노초)
        long startTime = System.nanoTime();

        long sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum += i;
        }
        // 종료 시간 측정 (나노초)
        long endTime = System.nanoTime();

        // 계산 결과와 소요 시간 출력
        long duration = endTime - startTime;
        System.out.println("합계: " + sum);
        System.out.println("계산에 소요된 시간: " + duration + " 나노초");
    }
}
