package vn.codegym.creational;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/06
 * Time: 15:15
 */
public class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        try (FileWriter fileWriter = new FileWriter("center.log", true)) {
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(new Date() + ": " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void log(String type, String message) {
        try (FileWriter fileWriter = new FileWriter("center.log", true)) {
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(new Date() + " [" + type + "]: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
