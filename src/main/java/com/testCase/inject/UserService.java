package com.testCase.inject;

/**
 * @author baiju Feb 25 2016
 */
public class UserService {

    private UserMapper userMapper;

    public void addUser(User user) {
        userMapper.add(user);
    }
}
