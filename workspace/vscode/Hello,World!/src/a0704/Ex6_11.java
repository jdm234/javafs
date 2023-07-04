package a0704;

public class Ex6_11 {
    public static void main(String[] args) {
        car c1 = new car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        car c2 = new car();
        c2.color = "white";
        c2.gearType = "auto";
        c2.door = 5;
        System.out.println("c1의 color="+c1.color + ",gearType=" + c1.gearType + ",door=" + c1.door);
        System.out.println("c2의 color="+c2.color + ",gearType=" + c2.gearType + ",door=" + c2.door);
    }
}

class car{
    String color;
    String gearType;
    int door;
    //Car(){}
}
