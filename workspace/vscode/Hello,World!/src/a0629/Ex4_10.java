public class Ex4_10 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 5; i++){ // 괄호{}안의 문장을 3번 반복
            /* sum = sum + i; */
            sum +=i;
        System.out.printf("1부터 %2d 까지의 합 : 2%d%n", i, sum);
        }
        // %2d 정수를 출력할 때 최소 다리로 출력하고, 필요한경우 앞을 공백으로 채우는 형식 지정자
    }
}
