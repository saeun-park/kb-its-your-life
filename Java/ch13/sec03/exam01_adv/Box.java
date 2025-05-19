package ch13.sec03.exam01_adv;

// 제너릭 클래스 Box 선언
public class Box<T> {
    //타입 T의 필드 선언
    private T t;

    // 값을 반환하는 메서드 getter
    public T get(){
        return t;
    }
    // 값을 설정하는 메서드 setter
    public void set(T t){
        this.t = t;
    }
}
