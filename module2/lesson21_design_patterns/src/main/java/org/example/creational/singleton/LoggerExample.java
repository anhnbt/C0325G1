package org.example.creational.singleton;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/06
 * Time: 14:30
 * Singleton Pattern:
 * Sử dụng lớp lồng nhau Holder để đảm bảo lazy initialization và thread-safe.
 * Ghi log:
 * Ghi thông điệp vào file app.log trong chế độ append.
 * Thread-safe:
 * Singleton đảm bảo chỉ có một instance của Logger được tạo, ngay cả khi ứng dụng chạy đa luồng.
 */
public class LoggerExample {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("This is a log message.");
        logger.log("Logging another message.");
        // Attempt to create another instance (will return the same instance)
        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("This message is logged through another reference.");
        // Verify that both references point to the same instance
        if (logger == anotherLogger) {
            System.out.println("Both references point to the same Logger instance.");
        } else {
            System.out.println("Different Logger instances were created.");
        }
    }
}
