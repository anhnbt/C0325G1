package vn.codegym;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/28
 * Time: 10:38 ${AM_PM}
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter side A: ");
            int sideA = sc.nextInt();
            System.out.print("Enter side B: ");
            int sideB = sc.nextInt();
            System.out.print("Enter side C: ");
            int sideC = sc.nextInt();
            validateTriangle(sideA, sideB, sideC);
            Triangle triangle = new Triangle(sideA, sideB, sideC);
            System.out.println("3 canh cua tam giac la " + triangle);
            System.out.println("Day la hinh tam giac hop le");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Ket thuc chuong trinh");
    }

    private static void validateTriangle(int sideA, int sideB, int sideC) throws Exception {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalTriangleException("Cac canh cua tam giac phai lon hon 0");
        }
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalTriangleException("Tong hai canh phai lon hon canh con lai");
        }
    }
}