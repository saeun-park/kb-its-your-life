package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = 0;

        while(true){
            System.out.println("------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("------------------------");

            int num = sc.nextInt();

            if(num==1){
                System.out.println("선택: " + num);
                speed ++;
                System.out.println("현재 속도 = " + speed);
            }else if(num==2){
                System.out.println("선택: " + num);
                speed --;
                System.out.println("현재 속도 = " + speed);
            }else if(num==3){
                System.out.println("선택: " + num);
                System.out.println("프로그램 종료");
                break;
             }else{
                System.out.println("올바른 숫자를 입력해주세요");
            }
    }}
    }
