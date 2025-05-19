package ch15.sec02.exam01_adv;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        // ArrayList 인스턴스 생성
        List<Board> list = new ArrayList<>();

        // 인스턴스 5개를 생성하여 ArrayList에 추가
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        // ArrayList에 저장된 요소의 개수 출력
        int size = list.size();
        System.out.println(size);

        // 3번째 데이터를 추출하여 출력
        Board board = list.get(2);
        System.out.println(board.getSubject() + ", " + board.getContent() + ", " + board.getWriter());

        // 일반 for문으로 순회하면서 리스트의 각 요소를 출력
        for(int i=0; i<size; i++){
            board = list.get(i);
            System.out.println(board.getSubject() + ", " + board.getContent() + ", " + board.getWriter());
        }

        // 인덱스 2에 해당하는 요소 제거
        list.remove(2);
        list.remove(2);

        // 향상된 for문으로 순회하면서 리스트의 각 요소를 출력
        for(Board b : list){
            System.out.println(b.getSubject() + ", " + b.getContent() + ", " + b.getWriter());
        }


    }
}
