package cn.edu.example.proxy;

/**
 * @Author: virgil
 * @Date; 2020/5/3 4:05 下午
 * @Version: 1.0
 **/
public class DefaultSimpleBean implements SimpleBean {

    private long dummy;

    public void advised() {
        dummy = System.currentTimeMillis();
    }

    public void unadvised() {
        dummy = System.currentTimeMillis();
    }

}
