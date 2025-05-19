package ch07.sec08.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
//        bus.run();
        driver.drive(bus);

        Taxi taxi = new Taxi();
//        taxi.run();
        driver.drive(taxi);
    }
}
