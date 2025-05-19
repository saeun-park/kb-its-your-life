package ch11.sec02.exam01;

// 수정 전 코드
//public class ExceptionHandlingExample1 {
//    public static void printLength(String data) {
//        int result = data.length();
//        System.out.println("문자 수: " + result);
//    }
//    public static void main(String[] args) {
//        System.out.println("[프로그램 시작]\n");
//        printLength("ThisIsJava");
//        printLength(null);
//        System.out.println("[프로그램 종료]");
//    }
//}

// 코드의 문제점 : 예외처리가 없다.
// printLength(null)에서 null이 printLength메서드에 전달되면,
// data.length()의 data가 null이므로 NullPointerException 발생함

// ----------------------------------------------------------------------
// 수정 후 코드
public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        try{
        int result = data.length();
        System.out.println("문자 수: " + result);
        }
        catch(NullPointerException e){
            System.out.println("예외 객체의 메시지: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}