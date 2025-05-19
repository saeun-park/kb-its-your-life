package ch03.exam_adv;
public class Trapezoid {
    public static void main(String[] args) {
        int top = 5;
        int bottom = 10;
        int height = 7;
        double area = (top + bottom) * height / 2.0;
        System.out.println("사다리꼴의 넓이: " + area);
    }
}