package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 90;
        if(score < 70 && score >= 0){
            char grade = 'D';
            System.out.println("점수가 " + score + "입니다.");
            System.out.println("등급은 " + grade + "입니다.");
        }
        else if(score < 80 && score >= 70){
            char grade = 'C';
            System.out.println("점수가 " + score + "입니다.");
            System.out.println("등급은 " + grade + "입니다.");
        }
        else if(score < 90 && score >= 80){
            char grade = 'B';
            System.out.println("점수가 " + score + "입니다.");
            System.out.println("등급은 " + grade + "입니다.");
        }
        else{
            char grade = 'A';
            System.out.println("점수가 " + score + "입니다.");
            System.out.println("등급은 " + grade + "입니다.");
        }
    }
}