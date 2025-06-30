package vn.codegym.demo;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/30
 * Time: 11:13
 */
public class DataOutputStreamDemo {
    public static void main(String[] args) {
        // .txt, .dat
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("out.bin"))) {
            out.writeInt(80);
            out.writeUTF("HelloWorld");
            out.writeDouble(3.14159);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
