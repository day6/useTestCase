package com.testCase.basic;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * @author baiju Feb 25 2016
 */
public class AbstractClassTest {

    @Test
    public void testSayHello() throws Exception {
        AbstractClass test = mock(AbstractClass.class);
        doCallRealMethod().when(test).sayHello();
        test.sayHello();
        verify(test).sayHello();
    }
}