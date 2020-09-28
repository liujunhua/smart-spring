package com.smart.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author liujunhua
 * @description: TODO
 * @date 2020/9/715:09
 */

@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.smart.spring.aop.service.UserService.*(..))")
    public void before() {
        System.out.println("AnnotationPointCut方法执行前");
    }

    @After("execution(* com.smart.spring.aop.service.UserService.*(..))")
    public void after() {
        System.out.println("AnnotationPointCut方法执行后");
    }
}
