/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/15
 * Time: 17:20
 */
public class Demo {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.makeSound();
//        System.out.println(dog.toString());
        Animal animal = new Dog();
        animal.makeSound();
        Animal choNghiepVu = new Dog(4);
        choNghiepVu.makeSound();
        // Ep kieu
        Dog dog = (Dog) choNghiepVu;
        System.out.println(dog.getLeg());

        Animal doreamon = new Cat();
        if (choNghiepVu instanceof Cat) {
            Cat meoMay = (Cat) choNghiepVu;
            meoMay.tuiThanKy();
        }
    }
}
