package cn.edu.example.classloader;

/**
 * @author virgil.Wang
 * @date 2020/5/14 15:53
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(contextClassLoader);
    }

}
