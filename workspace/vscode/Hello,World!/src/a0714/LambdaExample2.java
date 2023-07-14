package a0714;

public class LambdaExample2 {
    public static void main(String[] args) {
        Person person = new Person();

        person.action((name, job) -> {
            System.out.println(name+"이");
            System.out.println(job+"을 합니다.");
        });

        person.action(word->{
            System.out.println(word+"라고 말합니다.");
        });
    }
}
