package org.example;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/04
 * Time: 15:18
 */
public class Student {
    private String name;
    private int age;
    private double[] scores;

    public Student() {
    }

    public Student(String name, int age, double[] scores) {
        this.name = name;
        this.age = age;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    // grade


    // print detail
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", scores=" + (scores != null ? Arrays.toString(scores) : "null") +
//                ", averageScore=" + calculateAverageScore() +
//                ", grade='" + getGrade() + '\'' +
                '}';
    }
}
