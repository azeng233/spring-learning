package cn.zengchen233.log;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class Log implements MethodBeforeAdvice {

    //method： 要执行的目标对象的方法
    //args： 参数
    //target： 目标对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "被执行了");
    }
}
