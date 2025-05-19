package ch12.sec05;


import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String data2 = "홍길동/이수홍/박연수";

        // split 사용
        String[] names1 = data1.split("[&,]");
        for (String name : names1) {
            System.out.println(name);
        }

        // StringTokenizer 사용
        StringTokenizer tokenizer = new StringTokenizer(data2, "/");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }


}
