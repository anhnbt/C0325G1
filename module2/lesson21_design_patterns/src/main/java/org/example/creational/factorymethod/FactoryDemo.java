package org.example.creational.factorymethod;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/05
 * Time: 17:27
 */
public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal dog = animalFactory.getAnimal("canine");
        System.out.println("org.example.creational.factorymethod.Dog sound: " + dog.makeSound());

        Animal cat = animalFactory.getAnimal("feline");
        System.out.println("org.example.creational.factorymethod.Cat sound: " + cat.makeSound());

        // Uncommenting the following line will throw an exception
        // org.example.creational.factorymethod.Animal unknown = animalFactory.createAnimal("unknown");
    }
}
