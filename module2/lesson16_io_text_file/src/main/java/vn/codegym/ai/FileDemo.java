package vn.codegym.ai;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/29
 * Time: 15:32
 */
public class FileDemo {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("C0325G1.txt");
//        if (file.isDirectory()) {
//            String[] folders = file.list();
//            for (String folder : folders) {
//                System.out.println(folder);
//            }
//        }
//        System.out.println(file.getAbsolutePath());
//        if (file.exists()) {
//            System.out.println("File da ton tai");
//        } else {
//            System.out.println("File chua ton tai");
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        // try-with-resources
//            try (FileWriter writer = new FileWriter(file, true)) {
//                // buffer de ghi file lan
//                writer.write("Chien\n");
//                writer.write("Yen Nhi\n");
//                writer.write("Toan\n");
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            writer.write("Chien");
            writer.newLine();
            writer.write("Yen Nhi");
            writer.newLine();
            writer.write("Toan");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Da ghi file thanh cong!");
    }
}
