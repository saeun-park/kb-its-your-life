package ch04.sec07;

public class BreakExample {
    public static void main(String[] args) throws Exception {

        while(true){
            int num = (int)(Math.random()*6)+1;
            if(num==6){
                System.out.println("프로그램 종료");
                break;
            }else{
                System.out.println(num);
                continue;
            }
        }
    }
}