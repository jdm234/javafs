public class Ex4_13 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 5;

        while(sum <= 100) {
            System.out.printf("%d - %d%n", i, sum);
            /* i = i + 1;
            sum = sum + i; */
            sum += ++i;
        }
    }
}
