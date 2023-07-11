public class ValueCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("== : " + (obj1 == obj2));
        System.out.println("equals(): " + obj1.equals(obj2));
        System.out.println();

        Integer obj3 = 10;
        // -128에서 127 사이의 값인 경우에만 == 연산자로 비교 시 true가 나올수 있다.
        Integer obj4 = 10;
        
        System.out.println("== : " + (obj3 == obj4));
        System.out.println("equals() : " + obj3.equals(obj4));
    }
}
