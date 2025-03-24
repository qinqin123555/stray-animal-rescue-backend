package org.example.strayanimalrescuebackend.mapper;

public class UserMapper {
    int checkUserExists(String username, String email); // 查询用户名或邮箱是否已存在
    int registerUser(User user); // 插入新用户
}
