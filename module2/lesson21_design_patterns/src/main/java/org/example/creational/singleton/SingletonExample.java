package org.example.creational.singleton;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/06
 * Time: 14:11
 */
public class SingletonExample {
    public static void main(String[] args) {
        // Get the single instance of the Singleton class
        Singleton singletonInstance = Singleton.getInstance();
        Singleton anotherInstance = Singleton.getInstance();
        // Verify that both references point to the same instance
        if (singletonInstance == anotherInstance) {
            System.out.println("Both references point to the same Singleton instance.");
        } else {
            System.out.println("Different instances were created.");
        }

        // Call a method on the singleton instance
        singletonInstance.showMessage();
    }
}
