package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/23
 * Time: 16:21
 */
public class ProductManager {
    private static List<Product> products;

    static {
        products = new ArrayList<>();
        // Initialize with some products
        products.add(new Product("Product 1", 10.0));
        products.add(new Product("Product 2", 20.0));
        products.add(new Product("Product 3", 30.0));
    }

    public List<Product> getProducts() {
        return products;
    }

    // Method to display all Product
    public static void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("Product List: " + products.size());
            // show header product
            System.out.println(String.format("| %-5s | %-20s | %-10s |", "ID", "Name", "Price"));
            for (Product product : products) { // for-each
                System.out.println(product);
            }
        }
    }

    public static void addProduct() {
        products.add(inputProduct());
        System.out.println("Product added successfully.");
    }

    public static Product inputProduct() {
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name:");
        product.setName(scanner.nextLine());
        System.out.println("Enter product price:");
        product.setPrice(scanner.nextDouble());
        return product;
    }
}
