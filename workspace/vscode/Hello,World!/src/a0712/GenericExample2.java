package a0712;

public class GenericExample2 {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run();
    }
}

// Homeagency의 rent() 메서들 호출하여 Home 객체를 얻고, 이후 turnOnLight() 메서드를 호출하여 전등을 켭니다.
// Caragency의 rent() 메서드를 호출하여 Car 객체를 얻고, run() 메서드를 호출하여 자동차가 달립니다.
