package com.projectors.chat.controller.user;


import com.projectors.chat.dto.request.user.UserCreateReq;
import com.projectors.chat.service.user.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    // UserController 생성자, UserService 를 주입 받음
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 사용자 로그인 엔드 포인트
     *
     * @param dto UserCreateReq 객체, 사용자 로그인 정보
     * @return 로그인 성공 여부에 따른 ResponseEntity
     */
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserCreateReq dto) {
        boolean isSuccessful = userService.login(dto);
        if (!isSuccessful) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("입력하신 정보가 일치하지 않습니다. 확인 후 다시 로그인해 주세요.");
        } else {
            return ResponseEntity.ok(true);
        }
    }

    /**
     * 사용자 회원 가입 엔드 포인트
     *
     * @param dto UserCreateReq 객체, 사용자 회원 가입 정보
     * @return 회원 가입 성공 여부에 따른 ResponseEntity
     */
    @PostMapping("/join")
    public ResponseEntity<?> join(@RequestBody UserCreateReq dto) {
        boolean isSuccessful = userService.join(dto);
        if (!isSuccessful) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("회원가입이 정상적으로 처리되지 않았습니다. 다시 시도해 주세요.");
        } else {
            return ResponseEntity.ok(true);
        }
    }

}
