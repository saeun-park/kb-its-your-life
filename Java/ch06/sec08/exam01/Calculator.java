package ch06.sec08.exam01;

public class Calculator {
    void powerOn(){
        System.out.println("전원을 켭니다.");
    }

    void powerOff(){
        System.out.println("전원을 끕니다.");
    }

    int plus(int a, int b){
        return a+b;
    }

    double divide(int x, int y){
        double result = (double) x / y;
        return result;
    }

}
