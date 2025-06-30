package org.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/16
 * Time: 19:27
 */
public class FileReaderDemo {
    // Chuong trinh doc noi dung file sinh vien CodeGym va hien thi ra man hinh
    // Giai thich:
    // - FileReader dung de doc du lieu dang chuoi tu file van ban.
    // - BufferedReader giup doc tung dong mot, hieu qua hon.
    // - try-with-resources tu dong dong file sau khi doc xong.
    // - Neu file khong ton tai hoac co loi khi doc, se phat sinh IOException.
    public static void main(String[] args) {
        File file = new File("students_codegym.txt"); // Doc file sinh vien CodeGym
        try (FileReader fileReader = new FileReader(file);
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            System.out.println("Noi dung file sinh vien CodeGym:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Doc file thanh cong!");
        } catch (IOException e) { // Bat ca FileNotFoundException va IOException
            System.err.println("Loi khi doc file: " + e.getMessage());
        }
    }
}

// Giai thich ve Exception, throw va throws bang tieng Viet khong dau:
// - Exception la mot loi (ngoai le) xay ra khi chuong trinh dang chay, lam gian doan hoac anh huong den qua trinh thuc thi.
// - throws duoc dung trong khai bao ham de thong bao rang ham nay co the phat sinh mot loai ngoai le nao do (vi du: throws IOException).
// - throw duoc dung de tu minh nem ra mot ngoai le trong code (vi du: throw new IOException("Loi doc file")).
