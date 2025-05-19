package ch15.sec06.exam02;

import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        LinkedList<Message> q = new LinkedList<>();

        q.offer(new Message("sendMail", "홍길동"));
        q.offer(new Message("sendSMS", "신용권"));
        q.offer(new Message("sendKakaotalk", "감자바"));

        while(!q.isEmpty()){
            Message m = q.poll();
            if(m.command.equals("sendMail")){
                System.out.println(m.to + "님에게 메일을 보냅니다.");
            } else if(m.command.equals("sendSMS")){
                System.out.println(m.to + "님에게 SMS를 보냅니다.");
            } else if(m.command.equals("sendKakaotalk")){
                System.out.println(m.to + "님에게 카카오톡을 보냅니다.");
            }
        }

    }
}