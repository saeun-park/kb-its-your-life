package ch02.sec08;

public class CastingExample {
    public static void main(String[] args) {
        int var1 = 10;
        byte var2 = (byte) var1;  // int → byte: 명시적 형변환
        System.out.println(var2); // 출력: 10

        long var3 = 300L;
        int var4 = (int) var3;    // long → int: 명시적 형변환
        System.out.println(var4); // 출력: 300

        int var5 = 65;
        char var6 = (char) var5;  // int → char: 명시적 형변환
        System.out.println(var6); // 출력: A (ASCII 65)

        double var7 = 3.14;
        int var8 = (int) var7;    // double → int: 명시적 형변환 (소수점 제거)
        System.out.println(var8); // 출력: 3
    }
}

