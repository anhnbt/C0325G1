package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/23
 * Time: 16:18
 */
public class Product {
    public static int count = 0;
    private int id;
    private String name;
    private double price;

    public Product() {
        this.id = ++count;
    }

    public Product(String name, double price) {
        this.id = ++count;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        // Generate table for product
        return String.format("| %-5d | %-20s | %-10.2f |", id, name, price);
    }
}
