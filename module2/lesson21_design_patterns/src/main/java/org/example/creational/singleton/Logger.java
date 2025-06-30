package org.example.creational.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/06
 * Time: 14:27
 */
public class Logger {

    // Private constructor de ngan viec tao moi instance tu ben ngoai
    private Logger() {

    }

    // Static nested class de giu instance duy nhat
    private static class Holder {
        private static final Logger INSTANCE = new Logger();
    }

    // Phuong thuc de lay instance duy nhat
    public static Logger getInstance() {
        return Holder.INSTANCE;
    }

    // Phuong thuc de ghi log
    public void log(String message) {
        try (FileWriter fileWriter = new FileWriter("app.log", true)) {
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
