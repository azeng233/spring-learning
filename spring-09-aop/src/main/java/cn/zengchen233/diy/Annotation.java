package cn.zengchen233.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Annotation {
    @Before("execution(* cn.zengchen233.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("=====方法执行之前=====");
    }

    @After("execution(* cn.zengchen233.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("=====方法执行之后=====");
    }
}
