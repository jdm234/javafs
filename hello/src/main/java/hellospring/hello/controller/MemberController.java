package hellospring.hello.controller;


import hellospring.hello.domain.Member;
import hellospring.hello.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {

    private final MemberService memberService;
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
   //생성자에 @Autowired 가 있으면 스프링이 연관된 객체를 스프링컨테이너에서 찾아 넣어 준다.
    // 이렇게 의존관계를 외부에서 넣어주는 것을 DI, 의존성 주입


    // 스프링 빈으로 초기등록해야한다.
    //스핑빈을 등록하는 2가지방법
    // - 컴포넌트 스캔과 자동 의존관계 설정
    // - 자바코드로 직접 스프링 빈 등록하기
  //컴포넌트 스캔원리
    //@Component 에노테이션이 있으면 스프링 빈으로 자동 등록된다.
    //@Controller 가 있으면 스프링 빈으로 자동 등록되는데, 그 이유도 컴포넌트 스캔 때문이다.

    // @Component 를 포함하는 다음 어노테이션도 스프링 빈으로 자동 등록된다.
    // @Controller @Service @Repository
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping(value = "/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping(value = "/members/new")
    public String create(MemberForm form){
        Member member = new Member();
        member.setName(form.getName());
        memberService.join(member);
        return "redirect:/";
    }

    //회원 웹 기능 - 조회
    //회원 컨트롤러에서 조회기능
    @GetMapping(value = "/members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }
    // @valid 사용해서 MemberForm 객체를 검증한다.
    // 검증 결과는 BindingResult 객체에 저장된다.
    // result.hasErros()를 사용하여 검증결과 오류 있으면
    // 회원 가입 폼(members/createMemberForm)으로 다시 이동
    // MemberForm 객체에서 입력받은 도시(city), 거리(streat), 우편번호)(zipcode)
    // 정보를 사용하여 Address 객체를 생성
    // Member 객체를 생성하여 외원 이름을 MemberForm 객체에서 입력받은 이름으로 설정
    // 앞서 만들었던 'Address' 객체를 회원의 주소 정보로 설정
    // MemberService.join(member)를 통해 회원 객체를 회원 가입 처리한다.


}

