package ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] intarray = {1, 2, 3, 4, 5};

        IntStream intStream = Arrays.stream(intarray);
        intStream.asDoubleStream().forEach(d -> System.out.println(d));
        System.out.println();
        intStream = Arrays.stream(intarray);
        intStream.boxed().forEach(i -> System.out.println(i.intValue()));

    }
}
