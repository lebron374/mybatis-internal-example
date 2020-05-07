package cn.edu.example.proxy;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 * @Author: virgil
 * @Date; 2020/5/3 4:08 下午
 * @Version: 1.0
 **/
public class TestPointCut extends StaticMethodMatcherPointcut {

    public boolean matches(Method method, Class<?> clazz) {
        return ("advise".equals(method.getName()));
    }

}
