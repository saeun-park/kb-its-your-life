package ch09.sec06.exam01;

public class ButtonExample {
    public static void main(String[] args) {

        // OK버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
        class OKListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("OK 버튼을 클릭했습니다.");
            }
        }
    }
}
