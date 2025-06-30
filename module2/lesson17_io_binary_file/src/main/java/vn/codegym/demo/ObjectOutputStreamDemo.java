package vn.codegym.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/30
 * Time: 11:31
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) {
        Student std1 = new Student(1, "Hai Anh", 3.8);
        Student std2 = new Student(2, "Chien", 3.9);
        List<Student> students = new ArrayList<>();
        students.add(std1);
        students.add(std1);
        students.add(new Student(3, "An", 4.0));
        students.add(new Student(4, "Hoang", 3.7));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"))) {
            oos.writeObject(students);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
