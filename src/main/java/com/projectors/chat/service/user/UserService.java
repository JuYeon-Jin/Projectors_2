package com.projectors.chat.service.user;

import com.projectors.chat.dao.user.UserDao;
import com.projectors.chat.dto.request.user.UserCreateReq;
import com.projectors.chat.service.SessionService;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserDao userDao;
    private SessionService session;

    public UserService(UserDao userDao, SessionService session) {
        this.userDao = userDao;
        this.session = session;
    }

    public boolean login(UserCreateReq dto) {
        String userId = userDao.login(dto.getUserName(), dto.getPassword());
        if (userId == null || userId.trim().isEmpty()) {
            return false;
        }
        session.setAttribute("userId", userId);
        return true;
    }

    public boolean join(UserCreateReq dto) {
        int isInsertedSuccessful = userDao.join(dto.getUserName(), dto.getPassword(), "신규가입자");
        return isInsertedSuccessful > 0;
    }
}
