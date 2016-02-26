# 单元测试总结

## 目的
    保证正向逻辑和异常逻辑的正确性
## 验证
    单元测试覆盖率
## 范围
    1. 覆盖正常流程
    2. 程序边界,空、数字、异常


## Mockito使用
### 概念
    - stub
    - Answers
    - Matchers


### 启动
1.  方式一
```
    \@RunWith (MockitoJUnitRunner.class)
```
2. 方式二(推荐，可以和spring test共存)
```
    \@Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
```

### 常用用法

#### Mockito
```
    - mock
    - spy
    - verify
    - reset
    - doThrow
    - doAnswer
    - doNothing
    - doReturn
    - times
    - after
    - timeout
    - description
```

#### 主要


## Mockito 源码

### 调用
```
    - MockMethodInterceptor
    - InternalMockHandler<-InvocationNotifierHandler:InterceptedInvocation
    -
```

###  顶级接口
```
    - MockCreationSettings
        - CreationSettings
        - MockSettingsImpl
    - AbstractAwareMethod<-MockitoMethod
    - MockingProgress
    - VerificationMode
    - ArgumentMatcherStorage
    - InvocationListener
    - MethodInvocationReport
    - InOrder
    - FieldAnnotationProcessor

```