package com.projectors.chat.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

@Service
public class SessionService {

    private final HttpServletRequest request;

    public SessionService(HttpServletRequest request) {
        this.request = request;
    }

    public void setAttribute(String key, Object value) {
        HttpSession session = request.getSession();
        session.setAttribute(key, value);
    }

    public String getAttribute(String key) {
        HttpSession session = request.getSession();
        // Object value = session.getAttribute(key);
        return  (String) session.getAttribute(key);
    }

    public void invalidate() {
        HttpSession session = request.getSession();
        session.invalidate();
    }

}
