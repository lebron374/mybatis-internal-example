package cn.edu.example.reflect;

import org.apache.ibatis.reflection.TypeParameterResolver;

import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author virgil.Wang
 * @date 2020/5/8 15:21
 */
public class TypeTest {

    public static void main(String[] args) throws Exception{
        Field f = A.class.getDeclaredField("map");
        System.out.println(f.getGenericType());
        System.out.println(f.getGenericType() instanceof ParameterizedType);
        // 输出的是
        // java.util.Map<K, V>
        // true

        // 解析SubClassA<Long> (ParameterizedType类型)中的map字段
        Type type = TypeParameterResolver.resolveFieldType(f, ParameterizedTypeImpl.make(SubClassA.class, new Type[]{Long.class}, TypeTest.class));
        System.out.println(type.getClass());
        // class org.apache.ibatis.reflection.TypeParameterResolver$ParameterizedTypeImpl
        ParameterizedType parameterizedType = (ParameterizedType) type;
        System.out.println(parameterizedType.getRawType());
        // interface java.util.Map
        System.out.println(parameterizedType.getOwnerType());
        // null
        for (Type t : parameterizedType.getActualTypeArguments()) {
            System.out.println(t);
            // class java.lang.Long
            // class java.lang.Long
        }
    }

}
