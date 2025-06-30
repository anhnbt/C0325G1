package vn.codegym.creational;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/06
 * Time: 15:15
 */
public class Singleton {
    // instance doc ra tu bo nho
    private static Singleton instance;

    private Singleton() {
        // private constructor to prevent instantiation
    }

    // synchronized method
    public static Singleton getInstance() {
        if (instance == null) {
            // synchronized block
            // double-checked locking
            synchronized (Singleton.class) {
                if (instance == null) {
                    // create instance
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
