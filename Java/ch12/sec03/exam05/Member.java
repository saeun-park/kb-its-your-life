package ch12.sec03.exam05;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor        // 기본 생성자
@AllArgsConstructor       // 전체 필드 초기화 생성자
@EqualsAndHashCode        // equals(), hashCode()
@ToString                 // toString()
public class Member {
    private String id;
    private String name;
    private int age;
}

