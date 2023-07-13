package a0713;

import java.util.LinkedList;
import java.util.Queue;

public class Queueexample {
    public static void main(String[] args) {
        /* 
            Queue 인터페이를 구현한 LinkedList 사용하여 메세지 처리 
        */
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "신용권"));
        messageQueue.offer(new Message("sendKakaotalk", "감자바"));
        /* 
            offer() 메서드를 사용하여 메세지 개체를 큐에 추가
            isEmpty() 메서드를 사용하여 큐가 비어있지 않은경우
            메세지를 하나씩 꺼내어 처리
        */

        while(!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            /* 
                poll() 메서드를 사용하여 큐에서 가장 먼저 추가된 메세지를 제거하고 반환
            */
            switch(message.command) {
                case "sendMail" :
                System.out.println(message.to + "님에게 메일을 보냅니다.");
                break;
                case "sendSMS" :
                System.out.println(message.to + "님에게 SMS를 보냅니다.");
                break;
                case "sendKakaotalk" :
                System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
                break;
            }
        }
    }
}
