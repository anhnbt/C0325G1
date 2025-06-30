package org.example.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/16
 * Time: 19:38
 *
 * Giai thich ve BufferedWriter va PrintWriter:
 * - BufferedWriter la lop ghi file co bo dem, giup tang hieu nang khi ghi nhieu dong hoac du lieu lon.
 *   Khi dung FileWriter don thuan, moi lan goi write() du lieu se duoc ghi ngay xuong o dia, rat ton thoi gian neu ghi nhieu lan.
 *   BufferedWriter se luu du lieu vao bo dem truoc, chi ghi xuong o dia khi bo dem day hoac khi dong file.
 * - PrintWriter la mot lua chon de ghi file don gian va de bao tri hon, ho tro cac phuong thuc nhu print(), println(), printf() giong nhu System.out.
 *   PrintWriter co the ket hop voi BufferedWriter de vua de code vua hieu qua ve hieu nang.
 * - Nen day hoc vien su dung BufferedWriter truoc de hieu ve hieu nang khi ghi file, sau do gioi thieu PrintWriter de code ngan gon va de bao tri hon.
 */
public class BufferedWriterDemo {
    public static void main(String[] args) {
        // Su dung PrintWriter ket hop voi BufferedWriter de ghi file hieu qua va de code
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")))) {
            pw.println("Dong 1: Hello, World!");
            pw.println("Dong 2: Xin chao CodeGym!");
            pw.printf("Tong: %.2f", 123.45678);
            System.out.println("Da ghi du lieu vao file output.txt thanh cong!");
        } catch (IOException e) {
            // Nen xu ly loi ro rang de de bao tri va debug
            System.err.println("Loi khi ghi file: " + e.getMessage());
        }

        // Vi du doc du lieu tu ban phim va in ra console
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Nhap ten cua ban: ");
            String name = br.readLine();
            System.out.print("Nhap lop cua ban: ");
            String lop = br.readLine();
            System.out.println("Thong tin ban vua nhap:");
            System.out.println("Ho ten: " + name);
            System.out.println("Lop: " + lop);
        } catch (IOException e) {
            System.err.println("Loi khi doc du lieu tu ban phim: " + e.getMessage());
        }
    }
}

// Vi du su dung rieng BufferedWriter:
// try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
//     bw.write("Dong 1: Hello, World!");
//     bw.newLine();
//     bw.write("Dong 2: Xin chao CodeGym!");
//     bw.newLine();
//     bw.write(String.format("Tong: %.2f", 123.45678));
// }