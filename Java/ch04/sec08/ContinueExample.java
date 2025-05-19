package ch04.sec08;

public class ContinueExample {
    public static void main(String[] args) throws Exception {
        int i;
        for(i=1;i<=10;i++){
            if(i%2==0) {
                System.out.print(i + " ");
            }else{
                continue;
            }
        }
    }
}