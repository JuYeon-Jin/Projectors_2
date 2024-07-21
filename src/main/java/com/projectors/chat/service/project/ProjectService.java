package com.projectors.chat.service.project;

import com.projectors.chat.service.SessionService;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    private SessionService session;

    public ProjectService(SessionService session) {
        this.session = session;
    }

    // 임시로 생성
    public String getCurrentUserId() {
        return (String)session.getAttribute("userId");
    }

}
