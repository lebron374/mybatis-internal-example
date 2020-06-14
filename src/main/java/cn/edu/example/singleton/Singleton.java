package cn.edu.example.singleton;

/**
 * @author virgil.Wang
 * @date 2020/5/14 16:16
 */
public class Singleton {

    private Singleton() {}

    private static class InnerSingleton {
        private static Singleton instance = new Singleton();
    }

    public static Singleton newInstance() {
        return InnerSingleton.instance;
    }

}
