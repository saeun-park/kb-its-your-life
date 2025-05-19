package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coins = new Stack<>();

        // 동전 순서대로 추가
        coins.push(new Coin(100));
        coins.push(new Coin(50));
        coins.push(new Coin(500));
        coins.push(new Coin(10));

        // 스택이 빌 때까지 하나씩 뽑으면서 출력
        while(!coins.isEmpty()){
            Coin coin = coins.pop();
            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
        }
    }
}
