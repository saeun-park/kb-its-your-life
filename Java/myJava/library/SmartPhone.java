package myJava.library;

public class SmartPhone extends Object{
    //toString() 재정의 사용!
    private String company;
    private String os;

    public SmartPhone(String company, String os){
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() {
        return "전화";
    }
}
