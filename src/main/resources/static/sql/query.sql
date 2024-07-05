SHOW DATABASES;
USE projectors;
SHOW TABLES;
-- drop TABLE USER;
SELECT * FROM department;
SELECT * FROM grade;
SELECT * FROM user;

CREATE TABLE department (
    department_id INT AUTO_INCREMENT PRIMARY KEY,
    department_name VARCHAR(127) NOT NULL,
    deleted BOOLEAN NOT NULL DEFAULT false,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);
-- INSERT INTO department (department_name) VALUES ('개발팀')
-- SELECT department_id, department_name FROM department WHERE deleted = true;

CREATE TABLE grade (
    grade_id INT AUTO_INCREMENT PRIMARY KEY,
    grade_name VARCHAR(127) NOT NULL,
    deleted BOOLEAN NOT NULL DEFAULT false,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);
-- INSERT INTO grade (grade_name) VALUES ('사원')

CREATE TABLE user (
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
);
-- INSERT INTO user (user_id, username, password, nickname) values (uuid(), 'test01', 'test01', '테스트01')