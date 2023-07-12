package a0712;

public class CarAgency implements Rentable<Car> {
    @Override
    public Car1 rent() {
        return new Car1();
    }
}


// Caragency, Homeagency는 Rentable 인터페이스를 구현한다.
// Caragency 클래스는 Car 객체를 생성하여 반환
// Homeagency