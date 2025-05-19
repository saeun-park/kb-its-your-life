package ch15.sec05.exam03;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        // 데이터 추가
        list.add(new Person("홍길동", 35));
        list.add(new Person("감자바", 25));
        list.add(new Person("박지원", 31));

        // 데이터 정렬
        Collections.sort(list);

        // 데이터 순서대로 출력
        for (Person p : list){
            System.out.println(p.name + ", " + p.age);
        }

    }
}
