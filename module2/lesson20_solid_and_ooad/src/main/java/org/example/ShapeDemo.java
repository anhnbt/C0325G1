package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/04
 * Time: 15:36
 */
public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(5);
        Circle circle = new Circle();
        circle.setRadius(3);

        Triangle triangle = new Triangle();
        triangle.setBase(4);
        triangle.setHeight(3);

        AreaCalculator calculator = new AreaCalculator();
        System.out.println(calculator.calculateArea(rectangle)); // Output: 25.0
        System.out.println(calculator.calculateArea(circle)); // Output: 28.274333882308138
        System.out.println(calculator.calculateArea(triangle)); // Output: 6.0
    }
}
