package a0717;

public class Sample24 extends Thread {
    int seq;

    public Sample24 (int seq) {
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
        for (int i = 0; i < 10; i++) {
            Thread t = new Sample24(i);
            t.start();
        }
        System.out.println("main end"); /* main 메서드 종료 */
    }
}
