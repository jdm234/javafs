package a0714;

@FunctionalInterface
public interface Workable1 {
    void work(String name, String job);
    // work 추상 메소드를 정의
    // 매개변수가 없고 실행문이 포함되어 있지만 반환값이 없는 메소드

    // action 메소드 정의
    // 아 매소드는 Workable 인터페이스에서 매개변수로 받아서 workable 객체의 work메소드를 호출
    // action 메소드는 매개변수로 전달된 workable 객체의 work 메소드를 실행
}
