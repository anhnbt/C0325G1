package org.example.example;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/29
 * Time: 10:43
 */
public class FileDemo {
    public static void main(String[] args) {
//        vn.codegym.data.File f = new vn.codegym.data.File("foo.txt");
        File dir = new File("D:\\codegym\\C0325G1\\module2");
        if (dir.isDirectory()) {
            String[] dirContents = dir.list();
            for (String s : dirContents) {
                System.out.println(s);
            }
        }
        System.out.println(dir.getAbsolutePath());
//        dir.mkdir()
//        dir.delete();
    }
}
