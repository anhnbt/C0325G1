package org.example.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/29
 * Time: 10:57
 */
public class ScannerDemo {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner scanner = new Scanner(System.in);

//        vn.codegym.data.File file = new vn.codegym.data.File("scores.txt");
//        try (Scanner input = new Scanner(file)) {
//            while (input.hasNext()) {
//                System.out.println(input.next());
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//        Scanner input = new Scanner(new vn.codegym.data.File("test.txt"));
//        int intValue = input.nextInt();
//        String line = input.nextLine();
//        System.out.println(intValue);
//        System.out.println(line);

        Scanner scanner = new Scanner(new File("data.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();

    }

}
