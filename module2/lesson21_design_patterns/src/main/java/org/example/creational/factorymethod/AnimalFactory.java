package org.example.creational.factorymethod;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/05
 * Time: 17:20
 */
public class AnimalFactory {
    public Animal getAnimal(String type) {
        if ("canine".equalsIgnoreCase(type)) {
            return new Dog();
        } else if ("feline".equalsIgnoreCase(type)) {
            return new Cat();
        } else {
            return null;
        }
    }
}
