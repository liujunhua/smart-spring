package com.smart.spring.aop.service;

/**
 * @author liujunhua
 * @description: UserService
 * @date 2020/9/714:29
 */
public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("目标对象方法调用");
    }
}
