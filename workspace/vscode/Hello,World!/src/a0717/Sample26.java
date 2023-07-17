package a0717;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample26 implement  {
    int seq;

    public Sample26 (int seq) {
        this.seq = seq;
    }
    public void run() {
        System.out.println(this.seq + " thread start. "); /* 쓰레드 시작 */
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(this.seq + "thread end."); /* 쓰레드 종료 */
    }
    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < threads.size(); i++) {
            Thread t = new Thread(new Sample26(i));
            t.start();
            threads.add(t);
        }
        System.out.println();
    }
}
