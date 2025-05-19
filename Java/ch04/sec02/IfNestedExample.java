package ch04.sec02;

public class IfNestedExample {

    public static void main(String[] args) {
        int score = (int)(Math.random() * 20) + 81;;
        System.out.println("점수: " + score);
        String grade;
        if(score<90){
            if(score>=85){
                grade = "B+";
                System.out.println("학점: " + grade);
            }else{
                grade = "B";
                System.out.println("학점: " + grade);
            }
        }if(score>=90){
            if(score<95){
                grade = "A";
                System.out.println("학점: "+grade);
            }else{
                grade = "A+";
                System.out.println("학점: " + grade);
            }
        }
    }
}