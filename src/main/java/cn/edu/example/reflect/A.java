package cn.edu.example.reflect;

import java.util.Map;

/**
 * @author virgil.Wang
 * @date 2020/5/8 15:14
 */
public class A<K, V> {

    protected Map<K, V> map;

    public Map<K, V> getMap() {
        return map;
    }

    public void setMap(Map<K, V> map) {
        this.map = map;
    }

}
