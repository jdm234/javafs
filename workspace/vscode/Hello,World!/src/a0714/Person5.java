package a0714;

public class Person5 {
    public Member getMember1(Calcuable1 create) {
        String id = "winter";
        Member member = Creatable.create(id, id);
        return member;
    }

    public Member gMember2(Calcuable2 create) {
        String id = "winter";
        String name = "한겨울";
        Member member = Creatable.create(id, name);
        return member;
    }
}
