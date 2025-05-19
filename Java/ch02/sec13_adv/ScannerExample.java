package ch02.sec13_adv;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
//        // 사용자 입력을 받을 수 있는 Scanner 클래스
        Scanner scanner = new Scanner(System.in);
//
////        System.out.print("x갑 입력 : ");
////        String strX = scanner.nextLine();
////        int x = Integer.parseInt(strX);
////
////        System.out.print("y갑 입력 : ");
////        String strY = scanner.nextLine();
////        int y = Integer.parseInt(strY);
////
////        int result = x + y;
////        System.out.println("x+y = " + result);
////        System.out.println();

        while (true) {
            System.out.print("입력 문자열: ");
            String str = scanner.nextLine();

            if(str.equals("q")){
                System.out.println("종료");
                break;
            }else{
                System.out.println("출력 문자열: " + str);
            }



            }
        }

    }


