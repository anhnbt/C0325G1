package org.example.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/29
 * Time: 08:28
 */
public class FileWriterExample {
    // Ghi du lieu ra file (dong ra)
    public static void main(String[] args) {
        File file = new File("Hello.txt"); // output.txt, data.txt
        String data = "This is a sample text.";
        try (FileWriter writer = new FileWriter(file)) { // try-with-resources, Mo file de ghi
            writer.write(data); // Ghi de len du lieu cu
            System.out.println("Data written to file successfully");
            // Không cần flush(), close() sẽ lo flush trước khi đóng
//            writer.close(); // Dong file khi xong viec trong try-with-resources la khong can thiet
        } catch (IOException e) { // Cac lenh I/O deu co the gay ra ngoai le nen phai co try/catch
            e.printStackTrace(); //
        }
    }
}
