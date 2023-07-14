package a0714;

public class MethodReferenceExample1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.ordering(String :: compareToIgnoreCase);
    }
}
