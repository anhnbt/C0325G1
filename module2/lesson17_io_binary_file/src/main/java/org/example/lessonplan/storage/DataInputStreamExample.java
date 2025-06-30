package org.example.lessonplan.storage;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/30
 * Time: 08:27
 */
public class DataInputStreamExample {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("temp.dat"))) {
            System.out.println(dis.readUTF());
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());
            System.out.println(dis.readDouble());
            System.out.println(dis.readDouble());
        } catch (EOFException e) {
            System.out.println("All data were read.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
