package myJava.lambda;

public class LambdaTest {
    public static void main(String[] args) {
        action((int x, int y) ->{
            int result = x + y;
            System.out.println(result);
        });
        action((int x, int y) -> {
            int result = x - y;
            System.out.println(result);
        });
    }

    public static void action(Calculable c) {
        int x = 10;
        int y = 5;
        c.calculate(x, y);

    }
}
