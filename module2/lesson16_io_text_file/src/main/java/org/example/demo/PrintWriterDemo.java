package org.example.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/16
 * Time: 19:12
 */
public class PrintWriterDemo {
    public static void main(String[] args) {
        File file = new File("scores.txt");
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print("Dong 1");
            writer.println(1995);
            writer.print("Dong 2");
            writer.println(2019);
            writer.printf("Tong: %.2f", 123.45678);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
