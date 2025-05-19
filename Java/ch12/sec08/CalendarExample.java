package ch12.sec08;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {

        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1; // 0부터 시작하므로 +1
        int day = now.get(Calendar.DAY_OF_MONTH);

        int week = now.get(Calendar.DAY_OF_WEEK); // 1(일요일) ~ 7(토요일)
        int amPm = now.get(Calendar.AM_PM); // 0 = 오전, 1 = 오후
        int hour = now.get(Calendar.HOUR); // 0~11 (12시간제)
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        // 요일 이름 배열
        String[] weekdays = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
        String[] amPmStr = {"오전", "오후"};

        // 출력
        System.out.printf("%d년 %d월 %d일\n", year, month, day);
        System.out.println(weekdays[week] + " " + amPmStr[amPm]);
        System.out.printf("%d시 %d분 %d초\n", hour, minute, second);


    }
}
