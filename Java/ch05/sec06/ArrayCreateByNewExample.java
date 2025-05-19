package ch05.sec06;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        // 정수 배열 선언 및 생성 (초기화하지 않음 → 기본값 0)
        int[] arr1 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }

        // 문자열 배열 선언 및 생성 (초기화하지 않음 → 기본값 null)
        String[] arr2 = new String[3];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }
    }

}
