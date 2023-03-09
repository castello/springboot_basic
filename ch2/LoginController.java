package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.URLEncoder;

@Controller
@RequestMapping("/login")
public class LoginController {
//    @RequestMapping("/login/login")
//    @RequestMapping(value="/login/login", method=RequestMethod.GET)
    @GetMapping("/login")
    public String showLogin() {
        return "login"; // login.html을 화면에 보여줌
    }

    // 하나의 메서드로 GET, POST를 둘다 처리하는 경우
    //    @RequestMapping(value="/login/login", method= {RequestMethod.GET,RequestMethod.POST})
    //    @RequestMapping(value="/login/login", method= RequestMethod.POST) // 아래의 라인과 동일
    @PostMapping("/login")
    public String login(String id, String pwd, Model model) throws Exception{
        // 1. id, pwd를 확인
        if(loginCheck(id,pwd)) {
        // 2. 일치하면, userInfo.html
            model.addAttribute("id", id);
            model.addAttribute("pwd", pwd);
            return "userInfo" ;  // userInfo.html
        } else {
        //    일치하지 않으면, login.html로 이동
            String msg = URLEncoder.encode("id 또는 pwd가 일치하지 않습니다.", "utf-8");
            return "redirect:/login/login?msg="+msg;  // GET - URL재작성
        }
    }

    private boolean loginCheck(String id, String pwd) {
        return id.equals("asdf") && pwd.equals("1234");
    }
}
