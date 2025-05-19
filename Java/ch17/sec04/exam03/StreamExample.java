package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
    public static int sum;

    public static void main(String[] args){
        IntStream stream = IntStream.range(1,101);
        stream.forEach(i -> sum += i);
        System.out.println("총합: " + sum);
    }
}
