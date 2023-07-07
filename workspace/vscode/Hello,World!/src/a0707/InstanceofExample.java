package a0707;

public class InstanceofExample {
    public static void personInfo(Person person) {
        System.out.println("name : " + person.name);
        person.wait();

        /* if (person instanceof Student) {
            Studetn student = (Student) person;
            System.out.println("studentNo: " + studetn.studentNO;)
            student.study();
        } */

        if(person instanceof Student student) {
            System.out.println("studentNo: " + student.studentNo);
            student.study();
        }
    }
    public static void main(String[] args) {
        InstanceofExample p1 = new InstanceofExample("홍길동");
        personInfo(p1);

        System.out.println();

        InstanceofExample p2 = new Student("김길동", 10);
        personInfo(p2);
    }
}

/* 
    1. Penson 객체 정보를 출력
    2. Student  객체의 정보를 출력
    3. 이때 Student 객체는 Person 클래스를 상속 받았기 때문에 'personInfo()' 메서드에서 'instanceof' 연산자를 사용하여  Student 타입인지 확인하고, 필요에 따라 형변환 하여 Student 클래스에만 존재하는 필드와 메서드를 사용할 수 있게 된다.
 */