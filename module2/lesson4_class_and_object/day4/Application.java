package day4;

import day3.Person;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/13
 * Time: 15:26
 */
public class Application {
    public static void main(String[] args) {
        Person person = new Person("Hải Anh", 22);
        Person yenNhi = new Person("Yen Nhi", 22);
//        yenNhi.say("Hi");
//        person.say("Hello");
        Person personObj = new Person();
        person.displayInfo();
        yenNhi.displayInfo();
//        Truy cập vào các thuộc tính được bảo vệ
//        personObj.name
        personObj.setAge(23);
        personObj.setName("Vân Anh");
        personObj.displayInfo();
    }
}
