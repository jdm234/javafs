package a0712;

public class GenericExample1 {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();
        product1.setKind(new Tv());
        product1.setModel("스마트Tv");

        Tv tv = product1.getKind();
        String tvModel= product1.getModel();
        System.out.println("product1의 kind : " + tv);

        Product<Car, String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        Car car = product2.getKind();
        String CarModel = product2.getModel();
        System.out.println("product2의 kind : " + car);
        System.out.println("product2의 model : " + CarModel);
    }
}
