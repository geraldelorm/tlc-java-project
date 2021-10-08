package com.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Student implements Nameable{
    private String name;
    List<Double> grades;


    public Student(List<Double> grades) {
        this.grades = grades;
    }

    public Student(String name){
        this.name = name;
    }

    public double getAverageGrade(){
        double sum = 0;
        for (Double grade: grades){
            sum += grade;
        }
        double averageGrade = sum/grades.size();
        return averageGrade;
    }

    @Override
    public String getName() {
        return name;
    }
}
