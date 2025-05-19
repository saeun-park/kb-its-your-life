package ch04.sec03;

public class SwitchCharExample {
    public static void main(String[] args) {
        char grade = 'C';

        switch(grade){
            case 'A':
            case 'a':
                System.out.println("우수 회원입니다.");
                break;
            case 'B':
            case 'b':
                System.out.print("일반 회원입니다.");
                break;
            default:
                System.out.print("손님입니다.");

        }
    }
}