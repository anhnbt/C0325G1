package vn.codegym.demo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/30
 * Time: 11:18
 */
public class DataInputStreamDemo {
    public static void main(String[] args) {
        try (DataInputStream input = new DataInputStream(new FileInputStream("out.bin"))) {
            System.out.println(input.readInt());
            System.out.println(input.readUTF());
            System.out.println(input.readDouble());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
