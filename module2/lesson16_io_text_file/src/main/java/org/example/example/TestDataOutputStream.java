package org.example.example;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/29
 * Time: 10:48
 */
public class TestDataOutputStream {
    public static void main(String[] args) throws IOException {
        int[] arr = {1, 2, 3, 4, 5};
        File file = new File("output.txt");
        FileOutputStream fos = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fos);
        for (int item : arr) {
            dos.writeInt(item);
        }
        dos.close();
    }
}
