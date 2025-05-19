package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

        // 3. 포맷 적용
        String formatted = sdf.format(today);

        // 4. 결과 출력
        System.out.println(formatted);
    }
}
