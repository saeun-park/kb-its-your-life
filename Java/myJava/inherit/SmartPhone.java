package myJava.inherit;


public class SmartPhone extends Phone {
    //필드 2개(color, model) --> 3개(color, model, wifi)
    //메서드 4개(Phone) --> 6개(Phone + SmartPhone)
    //클래스내 메서드는 마음대로 호출가능
    //Phone();

    public boolean wifi;  //클래스 바로 아래 선언된 필드는 자동초기화
    //false (자동초기화)

    //color, model을 객체 생성 시 초기화를 하고 싶은 경우

    //우클릭 > 생성(generate) > 생성자(constructor)
    public SmartPhone(String color, String model) {
        //눈에는 안 보이지만 color, model 접근 가능해서 값 초기화
        this.color = color;
        this.model = model;
    }

    //메소드 선언
    public void setWifi (boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }
}
