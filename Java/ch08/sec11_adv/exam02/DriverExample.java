package ch08.sec11_adv.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus); // 자동 타입 변환: Bus -> Vehicle
        driver.drive(taxi); // 자동 타입 변환: Taxi -> Vehicle
    }
}
