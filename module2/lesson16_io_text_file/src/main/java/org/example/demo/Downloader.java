package org.example.demo;

import java.io.*;
import java.net.*;

public class Downloader {
    public static void main(String[] args) {
        String fileURL = "https://unsplash.it/500"; // URL nguồn
        String savePath = "downloaded.jpg";               // Tên file lưu

        try (InputStream in = new URL(fileURL).openStream();
             FileOutputStream out = new FileOutputStream(savePath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }

            System.out.println("Đã tải xong file: " + savePath);
        } catch (IOException e) {
            System.out.println("Lỗi khi tải file: " + e.getMessage());
        }
    }
}
