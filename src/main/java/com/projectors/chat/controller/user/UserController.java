package com.projectors.chat.controller.user;


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
    public void mainPage() {

    }

    @PostMapping("/login")
    public void login(Model model) {

    }

    @PostMapping("/join")
    public void join() {

    }

}
