package ch06.exam_adv;

public class Database {
    private String connection = "MySQL"; // 이 클래스 안에서만 사용하는 변수

    private static Database database = new Database();
    // 클래스가 로딩될 때 딱 한 번만 만들어지는 유일한 인스턴스(싱글톤)
    // static이라 객체 없이 클래스 이름으로 접근 가능
    // private이라서 외부에서 바꿀 수 없음

    private Database(){} // 다른 클래스가 직접 객체 생성 못 하게 막음

    public static Database getInstance(){
        return database;
    }

    public String connect() {
        System.out.println(connection + "에 연결합니다.");
        return connection;
    }
    public String getConnection() {
        return connection;
    }
    
    public void close() {
        System.out.println(connection + "을 닫습니다.");
    }
}

// Singleton 객체로 만들기
// 클래스의 인스턴스를 단 하나만 생성하고,
// 어디서든 그 하나의 인스턴스를 공유해서 쓰게 하는 디자인 패턴

// 방법 1. static 변수로 자기 자신의 유일한 인스턴스를 저장
// 2. 생성자를 private으로 막아서 외부에서 new로 만들지 못하게 함
// 3. 공개 static 메서드로 유일 인스턴스에 접근하게 함
