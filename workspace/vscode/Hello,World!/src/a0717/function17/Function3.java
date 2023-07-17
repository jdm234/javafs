package a0717.function17;

@FunctionalInterface
interface Calculator {
    int sum(int a, int b)
    public class Function3 {
    public static void main(String[] args) {
        Calculator mc = (int a, int b) -> a + b;
            int result = mc.sum(3, 4);
            System.out.println(result); /* 출력 */
    }
}

/*
 * 괄호 사이의 int a, int b는 Calculator 인터페이스의 sum 함수의 입력항목에 해당하고 -> 뒤에 a + b가 리턴 값에
 * 해당한다.
 * 이렇게 람다함수를 사용하면 MyCalculator와 같은 실제클래스 없이도 Calculator객체를 생성할 수 있다.
 */
