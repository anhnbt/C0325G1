package org.example;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/04
 * Time: 15:20
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student std = new Student("Nguyen Van A", 18, new double[]{5, 6, 7});
        CalculatorAverageStudent calculator = new CalculatorAverageStudent();
        GradeStudent gradeStudent = new GradeStudent();
        double average = calculator.calculateAverageScore(std.getScores());
        String grade = gradeStudent.getGrade(average);
        System.out.println(std);
        System.out.println(average);
        System.out.println(grade);
    }
}
