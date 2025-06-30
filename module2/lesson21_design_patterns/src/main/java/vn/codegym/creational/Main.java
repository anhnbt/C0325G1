package vn.codegym.creational;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/06
 * Time: 15:15
 */
public class Main {
    public static void main(String[] args) {
//        Singleton singleton = Singleton.getInstance();
//        Singleton anotherSingleton = Singleton.getInstance();
//        System.out.println(singleton == anotherSingleton); // Should print true

        StudentService studentService = new StudentService();
        TeacherService teacherService = new TeacherService();
    }
}
