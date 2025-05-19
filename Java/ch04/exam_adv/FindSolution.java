package ch04.exam_adv;

public class FindSolution {
    public static void main(String[] args) {
        for(int x=0; x<=10; x++){
            for(int y=0; y<=10; y++){
                int answer = 4*x + 5*y;
                if(answer==60){
                    System.out.println("("+x+","+y+")");
                }
            }
        }

    }
}
