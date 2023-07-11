package ArrayList;

public class Member {
    // 번호 이름 나이 주소
    private int id;
    private String name;
    private int age;
    private String address;

    // 기본생성자
    public MemberDTO() {

    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Member(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // toString
    public String toString () {
        return " " + id + "\t" + name + "\t" + age + "\t" + address;
    }
}
