package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = { "Spring", "Summer", "Fall", "Winter" };
        int[] scores = { 83, 90, 87 };
         float sum = 0;

        for (int i=0; i<season.length; i++){
            System.out.println("season["+i+"] : " + season[i]);
        }

        for (int i=0; i<scores.length; i++){
            sum += scores[i];
    }
        System.out.println("총합 : " + (int)sum);
        System.out.println("평균 : " + sum/scores.length);
    }
}