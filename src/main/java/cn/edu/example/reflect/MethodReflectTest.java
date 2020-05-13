package cn.edu.example.reflect;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author virgil.Wang
 * @date 2020/5/12 17:20
 */
public class MethodReflectTest {

    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("cn.edu.example.reflect.Person");
        Method[] methods = clazz.getDeclaredMethods();
        // Arrays.stream(methods).forEach(m -> System.out.println(m));
        Method method = clazz.getMethod("eat");
        System.out.println(method);
        Object person = clazz.newInstance();
        method.invoke(person);
    }

}
