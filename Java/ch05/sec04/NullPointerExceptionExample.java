package ch05.sec04;

//public class NullPointerExceptionExample {
//    public static void main(String[] args) {
//        int[] intArray = null;
//        intArray[0] = 10;
//        String str = null;
//        System.out.println("총 문자 수: " + str.length() );
//    }
//}
// //  코드의 잘못된 부분과 이유
// //  intArray배열이 null인데 인덱스로 접근하려고 함.
// //  str가 null인데 .length()를 호출함.

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = new int[1];
        intArray[0] = 10;
        String str = "Saeun";
        System.out.println("총 문자 수: " + str.length() );
    }
}
