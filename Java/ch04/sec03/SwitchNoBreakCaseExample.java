package ch04.sec03;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = 9; // 10, 11 인 경우
        System.out.println("[현재시간: " + time + " 시]");
        switch(time) {
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            default:
                System.out.println("외근을 나갑니다.");
        }
    }
}

// break 문이 없으면 하나의 case가 실행된 뒤에도
// 그 이후의 모든 case 문들이 실행된다