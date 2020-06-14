package cn.edu.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: virgil
 * @Date; 2020/5/16 11:54 上午
 * @Version: 1.0
 **/
public class JdkProxyTest {

    public static void main(String[] args) {

        MyInterface myInterface1 = new MyInterface() {
            @Override
            public String sayHello(String person) {
                return "hello," + person;
            }
        };

        String s = myInterface1.sayHello("chunxiao");
        System.out.println(s);

        MyInterface myInterface = (MyInterface) Proxy.newProxyInstance(JdkProxyTest.class.getClassLoader(), new Class<?>[]{MyInterface.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getAnnotations());
                System.out.println(args.length);
                return null;
            }
        });

        myInterface.sayHello("");

    }

}
