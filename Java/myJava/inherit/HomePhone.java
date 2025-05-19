package myJava.inherit;

public class HomePhone extends Phone{

    //메서드 이름쓰고 엔터하면 된다는데 난 왜안되지
    @Override //표시가 붙는다.
    // 컴파일러가 Phone에 있는 bell() 동일한지 확인해줌
    public void bell() {
        System.out.println("따르릉 따르릉 울리다.");
    }



}
