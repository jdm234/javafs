package a0712;

public class HomeAgency implements Rentable<Home> {
    @Override
    public Home rent() {
        return new Home();
    }
}

// Rentable 이라는 인터페이스는 제네릭 타입 p를 받음

