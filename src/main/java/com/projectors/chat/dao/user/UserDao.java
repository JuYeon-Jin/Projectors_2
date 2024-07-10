package com.projectors.chat.dao.user;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("SELECT user_id FROM user WHERE username = #{username} AND password = #{password}")
    String login(@Param("username") String username, @Param("password") String password);
    @Insert("INSERT INTO user (user_id, username, password, nickname) values (uuid(), #{username}, #{password}, #{nickname})")
    int join(@Param("username") String username, @Param("password") String password, @Param("nickname") String nickname);
}
