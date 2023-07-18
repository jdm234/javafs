package hellospring.hello.Repository;

import hellospring.hello.Domain.Member;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class MemoryMemberRepositoryTest {
    MemberRepository repository = new MemoryMemberRepository();

    @Test
    void save() {
        Member member1 = new Member();
        member1.setName("spring2");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring2").get();

        assertThat(result).isEqualTo(result);


    }

    class MemoryMemberRepositoryTest {
        MemberRepository repository = new MemoryMemberRepository();
    }

    @AfterEach
    public void afterEach(){

    }

    @Test
    void findAll() {
    Member member1 = new Member();
        member1.setName("spring2");
        repository.save(member1);

    Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);
    List<Member> result = repository.findAll();
    assertThat(result.size()).isEqualTo(2);
    }


}