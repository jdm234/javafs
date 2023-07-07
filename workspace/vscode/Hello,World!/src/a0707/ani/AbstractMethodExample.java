package a0707.ani;

public class AbstractMethodExample {
    public static void main(String[] args) {
        
        Dog1 dog1 = new Dog1();
        dog1.Sound();

        Cat1 cat1 = new Cat1();
        cat1.Sound();

        animal1Sound(new Dog1());
        animal1Sound(new Cat1());

    }

    public static void animal1Sound(Animal1 animal1) {
        animal1.Sound();
    }
}
