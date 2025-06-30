package org.example.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/29
 * Time: 08:35
 */
public class FileOutputStreamExample {
    public static void main(String[] args) {
        String data = "Xin chao, the gioi!";
        // Tao doi tuong FileOutputStream: Khoi tao doi tuong voi ten tep hoac doi tuong vn.codegym.data.File
        try (FileOutputStream fos = new FileOutputStream("output.txt")) { // sau khi gi xong, dong luong bang phuong thuc close() de giai phong tai nguyen
            byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
            // Ghi du lieu: Su dung phuong thuc write() de ghi du lieu vao tep
            // Tao hoac ghi de tep output.txt va ghi chuoi "Xin chao, the gioi"
            fos.write(bytes);
            System.out.println("Du lieu da duoc ghi vao tep.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Da xay ra loi: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Da xay ra loi: " + e.getMessage());
        }

        // Neu ghi du lieu dang van ban (character-oriented), can nhac su dung lop FileWriter thay vi FileOutputStream, vi FileWriter duoc thiet ke dac biet cho viec ghi van ban va xu ly ma hoa ky tu mot cach hieu qua hon
    }
}
