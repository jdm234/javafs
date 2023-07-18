package hellospring.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
    public class HelloController {
        @GetMapping("hello")
        public String hello(Model model) {
            model.addAttribute("data", "Hello!!");
            return "hello";
        }
        @GetMapping("hello-mvc")
        public String helloMvc(@RequestParam("name") String name, Model model) { // 외부에서 param 을 받음
            model.addAttribute("name", name);
            return "hello-template";
        }

    }
