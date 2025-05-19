package ch06.exam_adv2;

import java.util.*;

public class Input {
    static Scanner scanner = new Scanner(System.in);

    public static String read(String title){
        System.out.print(title);
        return scanner.nextLine();
    }
    // %s에 title, defaultValue가 차례대로 추가됨
    public static String read(String title, String defaultValue){
        System.out.printf("%s(%s):", title, defaultValue);
        String answer = scanner.nextLine();
        return answer.isEmpty() ? defaultValue : answer;
    }
    public static int readInt(String title){
        System.out.print(title);
        int answer = scanner.nextInt();
        scanner.nextLine();
        return answer;
    }
    public static boolean confirm(String title, boolean defaultValue){
        String yesNo = defaultValue ? "(Y/n)" : "(y/N)";
        System.out.printf("%s %s: ", title, yesNo);

        String answer = scanner.nextLine();
        if (answer.isEmpty()) return defaultValue;

        return answer.equalsIgnoreCase("y");
    }

    public static boolean confirm(String title){
        return confirm(title, true);
    }
}
