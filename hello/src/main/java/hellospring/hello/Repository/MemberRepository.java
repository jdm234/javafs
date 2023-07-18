package hellospring.hello.Repository;

import hellospring.hello.Domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //맴버객체를 저장
    Optional<Member> findByid(Long id); // 주어진 id에 멤버객체를 찾아 반환

    Optional<Member> findByName(Long id);

    Optional<Member> findByName(String name);
    List<Member> findAll();
    //저장되어 있는 모든멤버 객체를 리스트로 반환한다.
}