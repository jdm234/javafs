package a0714;

@FunctionalInterface
public interface Workable {
    void work(String string, String string2); // 단 한개의 추상메소드 work가 있으므로 익명 클래스를 생성하면 work메소드를 재정의 해서 구현
}
