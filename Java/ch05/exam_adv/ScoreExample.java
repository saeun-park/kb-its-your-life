package ch05.exam_adv;

import java.util.Scanner;

public class ScoreExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int num = 0;
        int[] score = null;


        while(run){
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = Integer.parseInt(scanner.nextLine());

            if(selectNo == 1){
                System.out.print("학생수> ");
                int studentNum = Integer.parseInt(scanner.nextLine());
                score = new int[studentNum];

            }else if(selectNo == 2){
                for(int i=0; i<score.length; i++){
                    System.out.print("score["+i+"]> ");
                    score[i] = Integer.parseInt(scanner.nextLine());
                }
                }else if(selectNo == 3){
                for(int i=0; i<score.length; i++){
                    System.out.println("score["+i+"]> " + score[i]);
            }
        }else if(selectNo == 4){
            int maxScore = 0;
            int sum = 0;
            double avg = 0;
            for(int i=0; i<score.length; i++){
            maxScore = Math.max(maxScore, score[i]);
            sum += score[i];
            }
            avg = (double)sum / score.length;
            System.out.println("최고 점수: " + maxScore);
            System.out.println("평균 점수: " + avg);
            }else if(selectNo == 5) {
                run = false;
        }
        }

    }
}
