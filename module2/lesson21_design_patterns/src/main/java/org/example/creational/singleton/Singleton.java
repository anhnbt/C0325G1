package org.example.creational.singleton;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/06
 * Time: 09:16
 */
//public class Singleton {
//    private static Singleton instance;
//
//    Lazy Initialization
//    private Singleton() {
//        // Private constructor to prevent instantiation
//    }
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton(); // NOT thread-safe
//        }
//        return instance;
//    }
//}

//public class Singleton {
//
//    // Eager Initialization
//    private static final Singleton instance = new Singleton();
//
//    private Singleton() {
//
//    }
//
//    public static Singleton getInstance() {
//        return instance;
//    }
//}

//public class Singleton {
//    private static final Singleton instance;
//
//    // Static Block Initialization
//    static {
//        try {
//            instance = new Singleton();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    private Singleton() {
//
//    }
//
//    public static Singleton getInstance() {
//        return instance;
//    }
//}

public class Singleton {
    //    private static Singleton instance;
    private static volatile Singleton instance; // Double-Checked Locking
    // volatile dam bao bien instance duoc doc dung tu bo nho chinh (khong bi cache loi).

    private Singleton() {
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    // thread-safe (Lazy Initialization)
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            return new Singleton();
//        }
//        return instance;
//    }
    // Double-Checked Locking
//    public static Singleton getInstance() {
//        if (instance == null) {
////            Double-Checked Locking
//            synchronized(Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }

    // Thread-safe, lazy, khong can synchronized, tranh nhieu van de thuong gap.
    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }
}