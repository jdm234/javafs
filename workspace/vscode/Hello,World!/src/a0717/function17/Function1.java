package a0717.function17;

public class Function1 {
    interface Calculator {
        int sum(int a, int b);
    }

    class MyCalculator implements Calculator {
        public int sum(int a, int b) {
            return a + b;
        }
    }
    public class function1 {
        public static void main(String[] args) {
            MyCalculator mc = new MyCalculator();
            int result = mc.sum(3, 4);
            System.out.println(result); /* 출력 */
        }
    }
}

