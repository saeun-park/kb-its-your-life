package ch03.sec04;

//자바에서 double은 0.1이 정확한 0.1이 아니라 근삿값임
public class AccuracyExample1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;
        double result = apple - number*pieceUnit;
        System.out.println("사과 1개에서 남은 양: " + result);
    }
}