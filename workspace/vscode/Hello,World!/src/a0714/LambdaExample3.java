package a0714;

public class LambdaExample3 {
    public static void main(String[] args) {
        Person person = new Person();

        person.action((x, y) -> {
            double result = x + y;
            return result;
        });

        person.action((x, y) -> (x + y));

        person.action((x, y) -> sum(x, y));
        // 리턴문이 하나만 있고 메서드 호출을 포함하는 경우 중괄와 리턴 키워드를 생략할 수 있다.
    }

    public static double sum(double x, double y) {
        return (x + y);
    }
}
