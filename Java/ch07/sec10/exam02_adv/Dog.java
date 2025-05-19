package ch07.sec10.exam02_adv;

public class Dog extends Animal{
    @Override
    public void breathe() {
        super.breathe();
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
