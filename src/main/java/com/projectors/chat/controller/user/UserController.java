package com.projectors.chat.controller.user;


import com.projectors.chat.dto.request.user.UserCreateReq;
import com.projectors.chat.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String mainPage() {
        return "/view/user/home";
    }

    @PostMapping("/login")
    public String login(Model model, UserCreateReq dto) {
        userService.login(dto);
        return "/view/project/home";
    }

    @GetMapping("/join")
    public String join() {
        return "/view/user/join";
    }

    @PostMapping("/join")
    public String join(UserCreateReq dto) {
        return "redirect:/";
    }

}
