public class SupersonicAirplane extends Airplane {
    public static final int NOMAl = 1; 
    public static final int SUPERSONIC = 2;

    public int flyMode = NOMAl;

    @Override
    public void fly() {
        if(flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        } else {
            super.fly();
        }
    }
}
