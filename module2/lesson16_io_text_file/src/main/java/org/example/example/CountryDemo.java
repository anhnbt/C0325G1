package org.example.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/29
 * Time: 14:38
 */
public class CountryDemo {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("countries.csv")) {
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                System.out.println(tokens[0]);
                System.out.println(tokens[1]);
                System.out.println(tokens[2]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
