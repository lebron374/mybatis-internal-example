package cn.edu.example.proxy;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author: virgil
 * @Date; 2020/5/3 4:11 下午
 * @Version: 1.0
 **/
public class NoOpBeforeAdvice implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object o) throws Throwable {

    }

}
