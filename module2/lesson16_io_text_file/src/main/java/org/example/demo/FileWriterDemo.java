package org.example.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/16
 * Time: 18:54
 */
public class FileWriterDemo {
    // Ghi du lieu ra file (dong ra)
    // Giai thich:
    // - FileWriter la lop dung de ghi du lieu dang chuoi vao file van ban.
    // - File la doi tuong dai dien cho mot file tren o dia.
    // - try-with-resources giup tu dong dong FileWriter sau khi ghi xong.
    // - Neu co loi khi ghi file (vi du: khong tim thay file, khong co quyen ghi), se phat sinh ngoai le IOException.
    public static void main(String[] args) {
        File file = new File("students_codegym.txt"); // Tao doi tuong File tro den file students_codegym.txt
        String data = "Ho ten: Nguyen Van A\nLop: C0325G1\nTrung tam: CodeGym"; // Chuoi du lieu se ghi vao file
        try (FileWriter writer = new FileWriter(file)) { // Mo FileWriter de ghi file
            writer.write(data); // Ghi chuoi vao file
            System.out.println("Da ghi thong tin sinh vien CodeGym vao file thanh cong!");
            // Khong can flush(), vi FileWriter se tu dong dong va day du lieu khi ket thuc khoi try
        } catch (IOException e) { // Bat ngoai le neu co loi khi ghi file
            System.err.println("Loi khi ghi file: " + e.getMessage());
        }
    }
}

// Giai thich ve Exception, throw va throws bang tieng Viet khong dau:
// - Exception la mot loi (ngoai le) xay ra khi chuong trinh dang chay, lam gian doan hoac anh huong den qua trinh thuc thi.
// - throws duoc dung trong khai bao ham de thong bao rang ham nay co the phat sinh mot loai ngoai le nao do (vi du: throws IOException).
// - throw duoc dung de tu minh nem ra mot ngoai le trong code (vi du: throw new IOException("Loi ghi file")).

// Vi du cu the:
// public void ghiFile() throws IOException {
//     if (coLoi) {
//         throw new IOException("Loi xay ra khi ghi file");
//     }
// }
