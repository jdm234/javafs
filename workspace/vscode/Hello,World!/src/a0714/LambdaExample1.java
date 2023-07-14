package a0714;

public class LambdaExample1 {
    public static void main(String[] args) {
        Person person = new Person();
        // Person 객체를 생성
        // action 메소드를 호출
        // 첫번째 호출에서는 람다식 사용하여 work 메소드를 {}안에 작성 

        person.action(() -> {
            System.out.println("출근을 합니다.");
            System.out.println("프로그래밍을 합니다.");
        });

        person.action(() -> System.out.println("퇴근합니다."));
    }
}
