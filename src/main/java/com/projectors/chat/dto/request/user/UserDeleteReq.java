package com.projectors.chat.dto.request.user;

public class UserDeleteReq {
    /*
    user_id CHAR(36) PRIMARY KEY,
    username VARCHAR(80) NOT NULL,
    password VARCHAR(80) NOT NULL,
    nickname VARCHAR(80) NOT NULL,
    department_id INT,
    department_name VARCHAR(127),
    grade_id INT,
    grade_name VARCHAR(127),
    deleted BOOLEAN NOT NULL DEFAULT false,
    joined_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (department_id) REFERENCES department(department_id),
    FOREIGN KEY (grade_id) REFERENCES grade(grade_id)

    -- UPDATE user SET deleted = true WHERE user_id = '?'
    * */

    // 탈퇴
    String userId;
    boolean deleted;

}
