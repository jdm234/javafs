package a0712;

public class Product <K, M> {
    private K kind;
    private M model;

    public K getKind() { return this.kind; }
    public M getModel() { return this.model; }
    public void setKind(K kind) { this.kind = kind; }
    public void setModel(M model) { this.model = model; }
}

// 제네릭을 사용해서 제품(product)을 나타내는 클래스를 구현한 예제입니다. product 클래스에는 k,m을 사용하여 두개의 타입변수를 가지고 있음. 이를 통해서 제품으 종류인(kind)와 모델(model)에 대한 타입을 유연하게 설정할수 있음

// main 메서드에는 두개의 product 객체를 생성하고 사용하는 예제가 제시되어 있다.

// 1. product 객체 product1은 Tv와 String을 타입 매개변수로 지정하여 생성되어있다.
// product1.setkind(new Tv())를 통해 kind에는 Tv 객체가, puduct1.setModel("스마트Tv")를 통해 model에는 "스마트Tv" 문자열이 저장
// product1.geKind()를 호출하면 Tv개기체가 변환, product1.getModel "스마트Tv" 문자열이 반환

// 2. Product 객체 product2도 마찬가지로 Car와 String을 타입 매개변수로 지정하여 생성됨. Product2.setKind(new Car())를 통해 kind에는 Car 객체가, product2.setModel("SUV자동차")을 통해 model에는 "SUV자동차" 문자열이 저장됨. 이후 produce2.getKind()를 호출하면 Car 객체가 반횐되고, produvt2.getModel()을 호출하면 "SUV자동차" 문자열이 반횐됨

// 제네릭을 사용하면 Product 클래스에서 다양한 종류의 제품을 다룰 수 있으며, 타입 안정성과 코드 재사용성을 높일수 있음.
 
        
