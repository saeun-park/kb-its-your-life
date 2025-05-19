package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        // Parent 타입으로 필드와 메서드 사용
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
//        parent.field2 = "data2"; // 자식 객체가 부모 타입으로 자동 변환하면 부모 타입에 선언된 필드와 메서드만 사용 가능함
//        parent.method3(); // 자식 타입에 선언된 필드와 메서드를 꼭 사용해야 한다면 강제 타입 변환을 해서 다시 자식 타입으로 변환해야함 (아래코드)

        // Child 타입으로 필드와 메서드 사용
        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();
    }
}
