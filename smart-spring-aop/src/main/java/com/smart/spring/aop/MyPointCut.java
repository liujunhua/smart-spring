package com.smart.spring.aop;

/**
 * @author liujunhua
 * @description: MyPointCut
 * @date 2020/9/714:59
 */


public class MyPointCut {

    public void before() {
        System.out.println("方法执行前");
    }

    public void after() {
        System.out.println("方法执行后");
    }
}
