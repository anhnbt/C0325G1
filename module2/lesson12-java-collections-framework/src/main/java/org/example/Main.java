package org.example;

import java.util.List;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/23
 * Time: 16:16 ${AM_PM}
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Add product
                    ProductManager.addProduct();
                    break;
                case 2:
                    ProductManager.displayProducts();
                    break;
                case 3:
                    // Search product
                    break;
                case 4:
                    // Delete product
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);
        System.out.println("Bye byte...");
    }

    private static void showMenu() {
        System.out.println("--- product management ---".toUpperCase());
        System.out.println("1. Add product");
        System.out.println("2. Show products");
        System.out.println("3. Search product");
        System.out.println("4. Delete product");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }
}