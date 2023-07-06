public class D extends A {
    public D() {
        super();
    }
    // D클래스는 A클래스와 다른 패키지에 있으나 A의 자식 클래스이므로 a필드, 메소드, 생성자 접근이 가능하다.

    public void method1() {
        this.field = "value";
        this.method();
    }

    public void method2() {
        A a = new A();
        a.field = "value";
        a.method();

        // 직접 개체생성해서 사용은 안된다.
    }
}
