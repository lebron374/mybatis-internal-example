package cn.edu.example.reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author virgil.Wang
 * @date 2020/5/8 18:40
 */
public class GenericReflectionTest {

    public static void main(String[] args) {
        /*String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            try(Scanner in = new Scanner(System.in)){
                System.out.println("Enter class name (e.g. java.util.Collections)");
                name = in.next();
            }
        }

        try {
            Class<?> cl = Class.forName(name);
            for (Method m : cl.getDeclaredMethods()) {

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
    }

    public static void printClass(Class<?> cl) {
        System.out.println(cl);

    }

}
