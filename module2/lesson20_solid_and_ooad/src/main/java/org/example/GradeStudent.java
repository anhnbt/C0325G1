package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/04
 * Time: 15:26
 */
public class GradeStudent {
    public String getGrade(double average) {
        if (average >= 90) {
            return "Xuat sac";
        } else if (average >= 80) {
            return "Gioi";
        } else if (average >= 70) {
            return "Kha";
        } else if (average >= 60) {
            return "Trung binh";
        } else {
            return "Yeu";
        }
    }
}
