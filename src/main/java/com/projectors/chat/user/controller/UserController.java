package com.projectors.chat.user.controller;

import com.projectors.chat.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public void login(Model model) {

    }

    @PostMapping("/join")
    public void join() {

    }

}
