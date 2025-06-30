package org.example.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/29
 * Time: 14:33
 */
public class BufferWriterExample {
    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Hello World");
            writer.newLine();
            writer.write("Another line");
            writer.flush(); // Day du lieu tu RAM ra file (neu can)
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
