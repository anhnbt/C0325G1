/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/14
 * Time: 16:50 PM
 */
class Student {
    public static int count;
    String name; // biến instance
    int age;
    double grade;

    public Student() {
        count++;
    }

    public Student(String name) {
        this.name = name;
        count++;
    }
}
