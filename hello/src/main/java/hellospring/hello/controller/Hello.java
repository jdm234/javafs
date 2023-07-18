package hellospring.hello.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// @GetMapping("hello") /hello 경로 들어오는 get 요청이 들어오면
// hello(Model model) 뷰(html)에 데이터 전달
// "data"라는 이름으로 "Hello!!" 라는 값을 모델에 추가

public class Hello{
    @GetMapping("hello")
    public String hellomvc(@RequestParam("name") String name1, Model model) {
        model.addAttribute("name", name1);
        return "hello";
    }




// @RequestParam("name")은 클라이언트가 요청 파라메로 전달한
// name 값(babo) name1 매개변수에
// model 객체는 뷰에 데이터를 전할하는데 사용

    @GetMapping("hello-api")
    @ResponseBody
    public String helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return "name";
    }

    private void setName(String name) {
    }
}
