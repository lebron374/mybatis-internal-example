package cn.edu.example.ordering;

/**
 * @author virgil.Wang
 * @date 2020/5/9 14:58
 */
public class PossibleReordering {

    static int x = 0, y = 0;
    static int a = 0, b = 0;

    public static void method() throws InterruptedException {
        Thread one = new Thread(() -> {
            a = 1;
            x = b;
        });

        Thread other = new Thread(() -> {
            b = 1;
            y = a;
        });

        one.start();
        other.start();

        one.join();
        other.join();

        System.out.print("(" + x + "," + y+ ")");
    }

    public static void main(String[]args) throws InterruptedException {

        for (int i = 0; i < 100000; i++) {
            method();
        }

    }

}
