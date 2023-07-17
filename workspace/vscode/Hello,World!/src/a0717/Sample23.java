package a0717;

/* 
    동작하고 있는 프로그램을 프로세스(Process)
    보통 한개 의 프로세스는 한 가지의 일을 하지만, 쓰레드를 이용하면 한 프로세스 내에서 두가지 또는 그 이상의 일을 동시에 할 수 있다.
*/
public class Sample23  extends Thread {
    public void run() {
        System.out.println("thread run");
    }

    public static void main(String[] args) {
        Sample23 sample = new Sample23();
        sample.start(); /* start()로 쓰레드를 실행한다. */
    }
}
