package org.example.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/29
 * Time: 10:27
 */
public class WriteData {
    public static void main(String[] args) throws IOException {
        File file = new File("scores.txt");
        if (file.exists()) {
            System.out.println("vn.codegym.data.File already exists");
            System.exit(1);
        }

//        // Create a file
//        PrintWriter output = new PrintWriter(file);
//
//        // Write formatted output to the file
//        output.print("John T Smith ");
//        output.println(90);
//        output.print("Eric K Jones ");
//        output.println(85);
//
//        // Close the file
//        output.close();

        FileWriter fw = new FileWriter(file);
        fw.write("Hello");
        fw.write("\nWorld");
        fw.close();
    }
}
