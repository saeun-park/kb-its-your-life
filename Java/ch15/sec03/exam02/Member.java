package ch15.sec03.exam02;

import java.util.Objects;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // hashCode(), equals()를 오버라이딩한 이유?
    // Member 객체들이 Set 같은 컬렉션에 들어갔을 때 값이 같으면 중복으로 간주되도록 하기 위함

    // hashCode 오버라이드
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // equals 오버라이드
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member target) {
            // obj가 Member 타입이면, target변수로 변환해서 써라
            // -> instanceof + 자동 형변환을 동시에 해주는 문법임

            return target.name.equals(name) && (target.age == age);
        } else{ return false; }
    }
}
