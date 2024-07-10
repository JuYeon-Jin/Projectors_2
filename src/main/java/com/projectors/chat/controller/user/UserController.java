package com.projectors.chat.controller.user;


import com.projectors.chat.dto.request.user.UserCreateReq;
import com.projectors.chat.service.user.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ResponseStatusException;

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
        boolean isSuccessful = userService.login(dto);
        if (!isSuccessful) {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, "입력하신 정보가 일치하지 않습니다. 확인 후 다시 로그인해 주세요.");
        }
        return "/view/project/home";
    }

    @GetMapping("/join")
    public String join() {
        return "/view/user/join";
    }

    @PostMapping("/join")
    public String join(UserCreateReq dto) {
        System.out.println("dto.getUserName() = " + dto.getUsername());
        System.out.println("dto.getPassword() = " + dto.getPassword());
        boolean isSuccessful = userService.join(dto);
        if (!isSuccessful) {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, "회원가입이 정상적으로 처리되지 않았습니다. 다시 시도해 주세요.");
        }
        return "redirect:/";
    }

}
