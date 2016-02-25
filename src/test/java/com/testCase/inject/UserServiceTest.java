package com.testCase.inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author baiju Feb 25 2016
 */
public class UserServiceTest {

    @Mock
    private UserMapper userMapper;
    @InjectMocks
    private UserService userService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test_add_user() {
        userService.addUser(new User());
    }
}
